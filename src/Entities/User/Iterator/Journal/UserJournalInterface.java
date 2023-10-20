package Entities.User.Iterator.Journal;

import Entities.User.Iterator.UserIterators.UserIterator;

public interface UserJournalInterface {
    UserIterator createFriendsIterator(String userName);

    UserIterator createCoworkersIterator(String userName);
}
