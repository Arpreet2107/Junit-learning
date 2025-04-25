package net.junit.assertions;

import net.junit.User;
import net.junit.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void testAssertNotNullScenarios() {
        UserService userService = new UserService();

        // Check that a valid username is not null
        String username = userService.getUserNameById(1);
        assertNotNull(username, "Username should not be null for valid user ID");

        // Check that a User object is not null
        User user = userService.getUserObject(10);
        assertNotNull(user, "User object should not be null for valid user ID");

        // Inline object creation test
        assertNotNull(new User(99, "Inline User"), "Inline User object should not be null");

        // Method call directly inside assertNotNull
        assertNotNull(userService.getUserObject(5), "Method returned null unexpectedly");

        // This would fail if uncommented
        // assertNotNull(userService.getUserObject(-1), "Expected non-null User but got null");
    }
}
