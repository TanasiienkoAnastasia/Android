package Entities.User.IteratorOfGenderOfUser.UserCollectionImplementation;
import Entities.User.IteratorOfGenderOfUser.User.User;
import Entities.User.IteratorOfGenderOfUser.User.UserGenderEnum;
import Entities.User.IteratorOfGenderOfUser.UserCollection.UserCollection;
import Entities.User.IteratorOfGenderOfUser.UserIterator.UserIterator;

import java.util.ArrayList;
import java.util.List;

public class UserCollectionImpl implements UserCollection {
    private List<User> usersList;

    public UserCollectionImpl() {
        usersList = new ArrayList<>();
    }

    public void addUser(User c) {
        this.usersList.add(c);
    }

    @Override
    public void removeUser(User c) {
        this.usersList.remove(c);
    }


    public UserIterator iteratorGender(UserGenderEnum gender) {
        return new UserCollectionImpl.UserGenderIteratorImpl(gender, this.usersList);
    }




    private class UserGenderIteratorImpl implements UserIterator {

        private UserGenderEnum gender;
        private List<User> users;
        private int position;

        public UserGenderIteratorImpl(UserGenderEnum gender,
                                List<User> usersList) {
            this.gender = gender;
            this.users = usersList;
        }

        @Override
        public boolean hasNext() {
            while (position < users.size()) {
                User c = users.get(position);
                if ((c.getGender().equals(gender) || gender.equals(UserGenderEnum.ALL))) {
                    return true;
                } else
                    position++;
            }
            return false;
        }

        @Override
        public User next() {
            User c = users.get(position);
            position++;
            return c;
        }

    }
}
