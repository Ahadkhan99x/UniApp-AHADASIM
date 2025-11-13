// File: Staff.java
public abstract class Staff extends Person implements Payable {
    private String role;
    private double salary;
    private FinancialAccount account;

    public Staff(String name, String email, String phone, String role, double salary) {
        super(name, email, phone);
        this.role = role;
        this.salary = salary;
        this.account = new FinancialAccount(this);
    }

    public String getStaffRole() {
        return role;
    }

    protected double getSalary() {
        return salary;
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int calculateWorkload() {
        return 40; // assume 40 hours/week
    }

    @Override
    public void accessLibrary() {
        System.out.println("Staff can borrow up to 10 books.");
    }

    // Payable
    @Override
    public void processPayment(double amount) {
        account.addTransaction("SALARY", amount);
        System.out.println(getName() + " (staff) received salary: " + amount);
    }

    @Override
    public String generateInvoice() {
        return "Salary slip for staff " + getName() + " | Monthly salary: " + salary;
    }

    @Override
    public String getFinancialSummary() {
        return account.getSummary();
    }

    @Override
    public double calculatePayments() {
        return salary;
    }

    @Override
    public void register() {
        System.out.println("Staff " + getName() + " registered in HR system.");
    }

    @Override
    public boolean login(String email, String password) {
        return getEmail().equals(email);
    }

    @Override
    public String getPermissions() {
        return "STAFF_PORTAL";
    }

    @Override
    public void displayDashboard() {
        System.out.println("=== Staff Dashboard: " + getName() + " ===");
        System.out.println("Role: " + role);
    }
}
