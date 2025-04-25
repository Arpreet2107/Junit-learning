package net.junit;

import java.util.HashMap;
import java.util.Map;

public class PaymentProcessor {
    private final Map<String, Transaction> transactions = new HashMap<>();

    public Transaction processPayment(String id, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        Transaction t = new Transaction(id, amount);
        transactions.put(id, t);
        return t;
    }

    public Transaction getTransaction(String id) {
        return transactions.get(id);
    }

    public static class Transaction {
        private final String id;
        private final double amount;

        public Transaction(String id, double amount) {
            this.id = id;
            this.amount = amount;
        }
    }
}