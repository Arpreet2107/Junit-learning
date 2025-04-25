package net.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PaymentProcessorTest {
    private PaymentProcessor processor;

    @BeforeEach
    void setUp() {
        processor = new PaymentProcessor();
    }

    // ===== ALL assertSame VARIATIONS =====
    @Test
    void testTransactionIdentity() {
        PaymentProcessor.Transaction t1 = processor.processPayment("T100", 50.0);

        // 1. Basic assertSame
        assertSame(t1, processor.getTransaction("T100"));

        // 2. assertSame with String message
        assertSame(
                t1,
                processor.getTransaction("T100"),
                "getTransaction() should return the same instance"
        );

        // 3. assertSame with Supplier<String> message
        String transactionId = "T100";
        assertSame(
                t1,
                processor.getTransaction(transactionId),
                () -> String.format("Transaction %s should return same instance", transactionId)
        );
    }

    // ===== ALL assertThrows VARIATIONS =====
    @Test
    void testInvalidPayment() {
        // 1. Basic assertThrows (returns the exception for further assertions)
        IllegalArgumentException e1 = assertThrows(
                IllegalArgumentException.class,
                () -> processor.processPayment("T200", -10.0)
        );
        assertEquals("Amount must be positive", e1.getMessage());

        // 2. assertThrows with String message
        assertThrows(
                IllegalArgumentException.class,
                () -> processor.processPayment("T300", 0.0),
                "Zero amount should throw exception"
        );

        // 3. assertThrows with Supplier<String> message
        double invalidAmount = -5.0;
        assertThrows(
                IllegalArgumentException.class,
                () -> processor.processPayment("T400", invalidAmount),
                () -> String.format("Amount %.2f should throw exception", invalidAmount)
        );
    }
}