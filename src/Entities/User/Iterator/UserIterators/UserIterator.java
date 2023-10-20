package Entities.User.Iterator.UserIterators;

import Entities.User.Iterator.User;

public interface UserIterator {
    boolean hasNext();

    User getNext();

    void reset();
}
