package net.junit;

public class UserService {
    public String getUserNameById(int id) {
        // For simplicity, return a username if id > 0
        if (id > 0) {
            return "Arpreet Mahala";
        }
        return null;
    }

    public User getUserObject(int id) {
        // If valid id, return a User object
        if (id > 0) {
            return new User(id, "John Doe");
        }
        return null;
    }
}
