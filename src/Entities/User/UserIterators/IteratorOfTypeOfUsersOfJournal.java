package Entities.User.UserIterators;

import Entities.User.User;
import Entities.User.Journal.UserJournal;

import java.util.ArrayList;
import java.util.List;

public class IteratorOfTypeOfUsersOfJournal implements UserIterator {
    private UserJournal userJournal;
    private String type;
    private String name;

    private int currentPosition = 0;
    private List<String> names = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public IteratorOfTypeOfUsersOfJournal(UserJournal userJournal, String type, String name) {
        this.userJournal = userJournal;
        this.type = type;
        this.name = name;
    }


    private void lazyLoad() {
        if (names.size() == 0) {
            List<String> users = userJournal.requestUserFriendsFromUserJournal(this.name, this.type);
            for (String user : users) {
                this.names.add(user);
                this.users.add(null);
            }
        }
    }


    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPosition < names.size();
    }

    @Override
    public User getNext() {
        if (!hasNext()) {
            return null;
        }

        String friendName = names.get(currentPosition);
        User friendUser = users.get(currentPosition);
        if (friendUser == null) {
            friendUser = userJournal.requestUserFromUserJournal(friendName);
            users.set(currentPosition, friendUser);
        }
        currentPosition++;
        return friendUser;
    }
    @Override
    public void reset() {
        currentPosition = 0;
    }

}