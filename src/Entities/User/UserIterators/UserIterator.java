package Entities.User.UserIterators;

import Entities.User.User;

public interface UserIterator {
    boolean hasNext();

    User getNext();

    void reset();
}
