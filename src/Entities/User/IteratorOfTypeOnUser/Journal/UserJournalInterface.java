package Entities.User.IteratorOfTypeOnUser.Journal;

import Entities.User.IteratorOfTypeOnUser.UserIterators.UserIterator;

public interface UserJournalInterface {
    UserIterator createFriendsIterator(String userName);

    UserIterator createCoworkersIterator(String userName);
}
