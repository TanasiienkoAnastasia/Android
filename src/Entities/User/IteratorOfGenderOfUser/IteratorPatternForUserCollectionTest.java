package Entities.User.IteratorOfGenderOfUser;


import Entities.File.Iterator.File.File;
import Entities.File.Iterator.File.FileCategoryEnum;
import Entities.File.Iterator.File.FileMonthDateEnum;
import Entities.File.Iterator.FileCollection.FileCollection;
import Entities.File.Iterator.FileIterator.FileIterator;
import Entities.User.IteratorOfGenderOfUser.User.User;
import Entities.User.IteratorOfGenderOfUser.User.UserGenderEnum;
import Entities.User.IteratorOfGenderOfUser.UserCollection.UserCollection;
import Entities.User.IteratorOfGenderOfUser.UserCollectionImplementation.UserCollectionImpl;
import Entities.User.IteratorOfGenderOfUser.UserIterator.UserIterator;

public class IteratorPatternForUserCollectionTest {

    public static void main(String[] args) {
        UserCollection users = populateUsers();
        UserIterator baseIterator = users.iteratorGender(UserGenderEnum.ALL);
        while (baseIterator.hasNext()) {
            User c = baseIterator.next();
            System.out.println(c.toString());
        }

        // Gender user
        System.out.println("Males: ");

        UserIterator maleIterator = users.iteratorGender(UserGenderEnum.MALE);
        while (maleIterator.hasNext()) {
            User c = maleIterator.next();
            System.out.println(c.toString());
        }

        System.out.println("Females: ");

        UserIterator femaleIterator = users.iteratorGender(UserGenderEnum.FEMALE);
        while (femaleIterator.hasNext()) {
            User c = femaleIterator.next();
            System.out.println(c.toString());
        }
    }

    private static UserCollection populateUsers() {
        UserCollection users = new UserCollectionImpl();
        users.addUser(new User("Maria", UserGenderEnum.FEMALE));
        users.addUser(new User("Anton", UserGenderEnum.MALE));
        users.addUser(new User("Lilia", UserGenderEnum.FEMALE));
        users.addUser(new User("Alina", UserGenderEnum.FEMALE));
        users.addUser(new User("Maksym", UserGenderEnum.MALE));
        users.addUser(new User("Olexandr", UserGenderEnum.MALE));
        users.addUser(new User("Ulia", UserGenderEnum.FEMALE));
        users.addUser(new User("Andriy", UserGenderEnum.MALE));

        return users;
    }
}
