package Journals;

import Iterators.UserIterator;

public interface Journal {
    UserIterator createFriendsIterator(String userName);

    UserIterator createCoworkersIterator(String userName);
}
