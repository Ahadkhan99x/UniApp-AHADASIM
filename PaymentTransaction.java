// File: PaymentTransaction.java
import java.time.LocalDateTime;

public class PaymentTransaction {
    private String type;
    private double amount;
    private LocalDateTime dateTime;

    public PaymentTransaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.dateTime = LocalDateTime.now();
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
