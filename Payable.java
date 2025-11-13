// File: Payable.java
public interface Payable {
    void processPayment(double amount);
    String generateInvoice();
    String getFinancialSummary();
}
