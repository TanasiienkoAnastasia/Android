package Entities.User.Iterator.Greeter;

import Entities.User.Iterator.User;
import Entities.User.Iterator.UserIterators.UserIterator;
import Entities.User.Iterator.Journal.UserJournalInterface;

public class UserGreeter {
    public UserJournalInterface journal;
    public UserIterator iterator;

    public UserGreeter(UserJournalInterface journal){
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
