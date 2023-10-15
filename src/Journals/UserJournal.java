package Journals;

import Entities.User;
import Iterators.Journals.UserJournalIterator;
import Iterators.UserIterator;

import java.util.ArrayList;
import java.util.List;

public class UserJournal implements Journal{
    private List<User> users;

    public UserJournal(List<User> cache) {
        if (cache != null) {
            this.users = cache;
        } else {
            this.users = new ArrayList<>();
        }
    }

    public User requestUserFromUserJournal(String userName) {

        simulateNetworkLatency();
        System.out.println("User journal: Loading user '" + userName + "' over the network...");

        // ...and return test data.
        return findUser(userName);
    }


    public List<String> requestUserFriendsFromUserJournal(String userName, String contactType) {
        // Here would be a POST request to one of the Facebook API endpoints.
        // Instead, we emulates long network connection, which you would expect
        // in the real life...
        simulateNetworkLatency();
        System.out.println("User journal: Loading '" + contactType + "' list of '" + userName + "' over the journal...");

        // ...and return test data.
        User user = findUser(userName);
        if (user != null) {
            return user.getContacts(contactType);
        }
        return null;
    }
    private User findUser(String userName) {
        for (User user : users) {
            if (user.getName().equals(userName)) {
                return user;
            }
        }
        return null;
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public UserIterator createFriendsIterator(String userName) {
        return new UserJournalIterator(this, "friends", userName);
    }

    @Override
    public UserIterator createCoworkersIterator(String userName) {
        return new UserJournalIterator(this, "coworkers", userName);
    }

}
