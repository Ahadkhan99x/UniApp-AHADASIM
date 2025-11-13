// File: Faculty.java
import java.util.ArrayList;
import java.util.List;

public abstract class Faculty extends Person implements Teachable, Researchable, Payable {
    private double salary;                 // encapsulated
    private String rank;
    private List<Course> coursesTeaching = new ArrayList<>();
    private ResearchProfile researchProfile;    // composition
    private FinancialAccount account;           // salary

    private OfficeRoom officeRoom;             // association one-to-one

    public Faculty(String name, String email, String phone, String rank, double salary) {
        super(name, email, phone);
        this.rank = rank;
        this.salary = salary;
        this.researchProfile = new ResearchProfile(this);
        this.account = new FinancialAccount(this);
    }

    public String getRank() {
        return rank;
    }

    protected double getSalary() {
        return salary;
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }

    public void setOfficeRoom(OfficeRoom officeRoom) {
        this.officeRoom = officeRoom;
    }

    public OfficeRoom getOfficeRoom() {
        return officeRoom;
    }

    public List<Course> getCoursesTeaching() {
        return coursesTeaching;
    }

    public void addCourse(Course course) {
        coursesTeaching.add(course);
    }

    public ResearchProfile getResearchProfile() {
        return researchProfile;
    }

    @Override
    public int calculateWorkload() {
        // simple: number of courses taught * 3 hours
        return coursesTeaching.size() * 3;
    }

    @Override
    public void accessLibrary() {
        System.out.println("Faculty can borrow up to 20 books.");
    }

    // Payable
    @Override
    public void processPayment(double amount) {
        account.addTransaction("SALARY", amount);
        System.out.println(getName() + " received salary: " + amount);
    }

    @Override
    public String generateInvoice() {
        return "Salary slip for " + getName() + " | Monthly salary: " + salary;
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
        System.out.println("Faculty " + getName() + " registered in HR system.");
    }

    @Override
    public boolean login(String email, String password) {
        return getEmail().equals(email);
    }

    @Override
    public String getPermissions() {
        return "FACULTY_PORTAL, GRADE_PORTAL, LIBRARY_PORTAL";
    }

    @Override
    public void displayDashboard() {
        System.out.println("=== Faculty Dashboard: " + getName() + " ===");
        System.out.println("Rank: " + rank);
        System.out.println("Courses teaching: " + coursesTeaching.size());
    }

    // Researchable defaults using ResearchProfile
    @Override
    public void publishPaper(String title) {
        researchProfile.addPublication(title);
    }

    @Override
    public void conductResearch(String topic) {
        researchProfile.addProject(topic);
    }

    @Override
    public void applyForGrant(double amount) {
        System.out.println(getName() + " applied for grant: " + amount);
    }
}
