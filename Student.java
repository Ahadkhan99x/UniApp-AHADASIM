// File: Student.java
import java.util.ArrayList;
import java.util.List;

public abstract class Student extends Person implements Enrollable, Payable {
    private double gpa;                     // private for encapsulation
    private String programLevel;           // Undergrad / Graduate / PhD
    private Transcript transcript;         // composition
    private EnrollmentRecord enrollmentRecord; // composition

    // Aggregation
    private List<Course> enrolledCourses = new ArrayList<>();
    private Faculty advisor;               // aggregation (advisor exists independently)
    private FinancialAccount account;      // fee transactions

    private StudentIDCard idCard;          // association (one-to-one)

    public Student(String name, String email, String phone, String programLevel) {
        super(name, email, phone);
        this.programLevel = programLevel;
        this.transcript = new Transcript(this);
        this.enrollmentRecord = new EnrollmentRecord(this);
        this.account = new FinancialAccount(this);
        this.idCard = new StudentIDCard(this);
    }

    public double getGpa() {
        return gpa;
    }

    protected void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getProgramLevel() {
        return programLevel;
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public EnrollmentRecord getEnrollmentRecord() {
        return enrollmentRecord;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setAdvisor(Faculty advisor) {
        this.advisor = advisor;
    }

    public Faculty getAdvisor() {
        return advisor;
    }

    public StudentIDCard getIdCard() {
        return idCard;
    }

    public void updateGrade(Course course, String letterGrade) {
        transcript.addGrade(course, letterGrade);
        calculateGPA();
    }

    public void calculateGPA() {
        this.gpa = transcript.calculateGPA();
    }

    @Override
    public void accessLibrary() {
        System.out.println(getRole() + " can borrow up to 5 books.");
    }

    @Override
    public int calculateWorkload() {
        int totalCredits = 0;
        for (Course c : enrolledCourses) {
            totalCredits += c.getCreditHours();
        }
        return totalCredits;
    }

    // Enrollable
    @Override
    public void enrollInCourse(Course course) {
        if (course.addStudent(this)) {
            enrolledCourses.add(course);
            enrollmentRecord.addCourse(course);
            System.out.println(getName() + " enrolled in " + course.getCode());
        } else {
            System.out.println("Could not enroll in " + course.getCode() + " (maybe full or prereq failed).");
        }
    }

    @Override
    public void dropCourse(Course course) {
        if (enrolledCourses.remove(course)) {
            course.removeStudent(this);
            enrollmentRecord.removeCourse(course);
            System.out.println(getName() + " dropped " + course.getCode());
        }
    }

    @Override
    public void viewSchedule() {
        System.out.println("Schedule for " + getName() + ":");
        for (Course c : enrolledCourses) {
            System.out.println(" - " + c.getCode() + " " + c.getTitle());
        }
    }

    // Payable
    @Override
    public void processPayment(double amount) {
        account.addTransaction("TUITION_PAYMENT", -amount);
        System.out.println("Student " + getName() + " paid " + amount);
    }

    @Override
    public String generateInvoice() {
        return "Invoice for student " + getName() + " | Outstanding: " + account.getBalance();
    }

    @Override
    public String getFinancialSummary() {
        return account.getSummary();
    }

    @Override
    public double calculatePayments() {
        // Simple example: base fee per enrolled course
        double baseFeePerCourse = 50000; // you can tweak
        return enrolledCourses.size() * baseFeePerCourse;
    }

    @Override
    public void register() {
        System.out.println("Student " + getName() + " registered in system.");
    }

    @Override
    public boolean login(String email, String password) {
        return getEmail().equals(email); // dummy logic
    }

    @Override
    public String getPermissions() {
        return "STUDENT_PORTAL, LIBRARY_PORTAL";
    }

    @Override
    public void displayDashboard() {
        System.out.println("=== Student Dashboard: " + getName() + " ===");
        System.out.println("Program: " + programLevel);
        System.out.println("GPA: " + gpa);
        System.out.println("Enrolled Courses: " + enrolledCourses.size());
    }
}
