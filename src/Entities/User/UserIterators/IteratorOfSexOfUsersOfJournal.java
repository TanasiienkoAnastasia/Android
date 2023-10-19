package Entities.User.UserIterators;

import Entities.User.Journal.UserJournal;
import Entities.User.User;

import java.util.ArrayList;
import java.util.List;

public class IteratorOfSexOfUsersOfJournal implements UserIterator{
    private UserJournal userJournal;
    private String name;
    private String sex;
    private int currentPosition = 0;
    private List<String> names = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public IteratorOfSexOfUsersOfJournal(UserJournal userJournal, String sex, String name) {
        this.userJournal = userJournal;

        this.name = name;
        this.sex = sex;
    }


    private void lazyLoad() {
        if (names.size() == 0) {
            List<String> users = userJournal.requestMalesFromUserJournal(this.sex);
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

        String maleName = names.get(currentPosition);
        User maleUser = users.get(currentPosition);
        if (maleUser == null) {
            maleUser = userJournal.requestUserFromUserJournal(maleName);
            users.set(currentPosition, maleUser);
        }
        currentPosition++;
        return maleUser;
    }
    @Override
    public void reset() {
        currentPosition = 0;
    }
}
