// File: Budget.java
public class Budget {
    private Department department;
    private double amount;

    public Budget(Department department, double amount) {
        this.department = department;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void allocate(double value) {
        amount -= value;
    }

    public void addFunds(double value) {
        amount += value;
    }
}
