package Entities.User.IteratorOfGenderOfUser.User;

import Entities.File.Iterator.File.FileCategoryEnum;
import Entities.File.Iterator.File.FileMonthDateEnum;

public class User {
    private String name;
    private UserGenderEnum gender;

    public User(String name, UserGenderEnum gender){
        this.name=name;
        this.gender=gender;
    }

    public String getName() {
        return name;
    }

    public UserGenderEnum getGender() {
        return gender;
    }

    @Override
    public String toString(){
        return "Name="+this.name+", category="+this.gender;
    }
}
