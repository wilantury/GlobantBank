package Data;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<User> users;

    public Bank(String name){
        this.name = name;
        users = new ArrayList<>();
    }

    public void addUser(User user){
        this.users.add(user);
    }

    public void removeUser(User user){
        this.users.remove(user);
    }

    public ArrayList<User> getUsers() {
        return this.users;
    }
}
