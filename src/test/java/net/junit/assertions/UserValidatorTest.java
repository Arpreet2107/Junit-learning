package net.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class UserValidatorTest {
    private final UserValidator validator = new UserValidator();

    // ==== Basic assertFalse ====
    @Test
    public void testInvalidUsername_TooShort() {
        // Standard assertFalse: Checks if the condition evaluates to false
        boolean result = validator.isUsernameValid("abc"); // 3 chars (invalid)
        assertFalse(result); // No message (minimalist)
    }

    // ==== assertFalse with Custom Failure Message ====
    @Test
    public void testInvalidUsername_NullInput() {
        // assertFalse with a descriptive message (appears if test fails)
        boolean result = validator.isUsernameValid(null);
        assertFalse(result, "Username should be invalid for null input");
    }

    // ==== assertFalse with BooleanSupplier (Lazy Evaluation) ====
    @Test
    public void testInvalidUsername_EmptyString() {
        // Uses BooleanSupplier to lazily evaluate the condition
        assertFalse(() -> validator.isUsernameValid(""),
                "Empty string should be invalid");
    }

    // ==== assertFalse with Supplier<String> (Lazy Message) ====
    @Test
    public void testInvalidUsername_SpecialCharacters() {
        // Message is computed only if the test fails (efficient for expensive messages)
        String invalidUsername = "user@#";
        assertFalse(
                validator.isUsernameValid(invalidUsername),
                () -> String.format("Username '%s' should be invalid", invalidUsername)
        );
    }

    // ==== Combined Example: Testing Multiple Invalid Cases ====
    @Test
    public void testMultipleInvalidUsernames() {
        String[] invalidUsernames = { "", "a", "123", null, "   " };

        for (String username : invalidUsernames) {
            assertFalse(
                    validator.isUsernameValid(username),
                    () -> "Username '" + username + "' should be invalid"
            );
        }
    }
}