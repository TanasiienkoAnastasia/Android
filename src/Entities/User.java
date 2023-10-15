package Entities;

import Iterators.UserIterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User{
    private String name;
    private String password;

    private Map<String, List<String>> users = new HashMap<>();

    public User(String name, String password, String... contacts) {
        this.name = name;
        this.password = password;


        for (String contact : contacts) {
            String[] parts = contact.split(":");
            String userType = "friend", userName;
            if (parts.length == 1) {
                userName = parts[0];
            }
            else {
                userType = parts[0];
                userName = parts[1];
            }
            if (!this.users.containsKey(userType)) {
                this.users.put(userType, new ArrayList<>());
            }
            this.users.get(userType).add(userName);
        }
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }


    public List<String> getContacts(String userType) {
        if (!this.users.containsKey(userType)) {
            this.users.put(userType, new ArrayList<>());
        }
        return users.get(userType);
    }
}
