package Iterators;

import Entities.User;

public interface UserIterator {
    boolean hasNext();

    User getNext();

    void reset();
}
