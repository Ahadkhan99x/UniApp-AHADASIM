// File: FinancialAccount.java
import java.util.ArrayList;
import java.util.List;

public class FinancialAccount {
    private Person owner;
    private List<PaymentTransaction> transactions = new ArrayList<>();

    public FinancialAccount(Person owner) {
        this.owner = owner;
    }

    public void addTransaction(String type, double amount) {
        transactions.add(new PaymentTransaction(type, amount));
    }

    public double getBalance() {
        double balance = 0;
        for (PaymentTransaction t : transactions) {
            balance += t.getAmount();
        }
        return balance;
    }

    public String getSummary() {
        return "Account summary for " + owner.getName() + " | Balance: " + getBalance();
    }
}
