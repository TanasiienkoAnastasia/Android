package Entities.User.IteratorOfGenderOfUser.UserCollection;
import Entities.User.IteratorOfGenderOfUser.User.User;
import Entities.User.IteratorOfGenderOfUser.User.UserGenderEnum;
import Entities.User.IteratorOfGenderOfUser.UserIterator.UserIterator;

public interface UserCollection {

    public void addUser(User c);

    public void removeUser(User c);

    public UserIterator iteratorGender(UserGenderEnum gender);
}


