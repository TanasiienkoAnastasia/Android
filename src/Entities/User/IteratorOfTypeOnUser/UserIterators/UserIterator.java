package Entities.User.IteratorOfTypeOnUser.UserIterators;

import Entities.User.IteratorOfTypeOnUser.User.User;

public interface UserIterator {
    boolean hasNext();

    User getNext();

    void reset();
}
