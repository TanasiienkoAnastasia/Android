package Greeter;

import Entities.User;
import Iterators.UserIterator;
import Journals.Journal;

public class UserGreeter {
    public Journal journal;
    public UserIterator iterator;

    public UserGreeter(Journal journal){
        this.journal = journal;
    }

    public void sendGreetToFriends(String userName, String message) {
        System.out.println("\nIterating over friends...\n");
        iterator = journal.createFriendsIterator(userName);
        while (iterator.hasNext()) {
            User user = iterator.getNext();
            sendMessage(user.getName(), message);
        }
    }
    public void sendGreetToCoworkers(String profileEmail, String message) {
        System.out.println("\nIterating over coworkers...\n");
        iterator = journal.createCoworkersIterator(profileEmail);
        while (iterator.hasNext()) {
            User user = iterator.getNext();
            sendMessage(user.getName(), message);
        }
    }

    public void sendMessage(String name, String message) {
        System.out.println("Sent message to: '" + name + "'. Message body: '" + message + "'");
    }
}
