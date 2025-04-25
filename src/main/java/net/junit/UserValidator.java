package net.junit;

public class UserValidator {
    public boolean isUsernameValid(String username) {
        // Username must be at least 4 characters long
        return username != null && username.length() >= 4;
    }
}