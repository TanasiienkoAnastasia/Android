package Entities.User.Journal;

import Entities.User.UserIterators.UserIterator;

public interface UserJournalInterface {
    UserIterator createFriendsIterator(String userName);

    UserIterator createCoworkersIterator(String userName);
}
