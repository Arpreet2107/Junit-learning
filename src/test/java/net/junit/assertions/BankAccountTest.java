package net.junit.assertions;

import net.junit.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void testWithdrawWithNegativeAmount() {
        BankAccount account = new BankAccount(1000);

        // ✅ Check if IllegalArgumentException is thrown when withdrawing negative amount
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-200);
        });
        // ✅ Optionally, check exception message
        assertEquals("Withdraw amount must be positive", exception.getMessage());
    }

    @Test
    public void testWithdrawWithZeroAmount() {
        BankAccount account = new BankAccount(1000);

        // ✅ Withdraw zero — should also throw IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(0));
    }

    @Test
    public void testWithdrawMoreThanBalance() {
        BankAccount account = new BankAccount(500);

        // ✅ Withdraw more than balance — should throw IllegalStateException
        assertThrows(IllegalStateException.class, () -> {
            account.withdraw(600);
        });
    }

    @Test
    public void testValidWithdraw() {
        BankAccount account = new BankAccount(1000);
        account.withdraw(300);

        // ✅ No exception expected, assert new balance
        assertEquals(700, account.getBalance(), "Balance should be updated after withdrawal");
    }
}
