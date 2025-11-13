// File: PhDStudent.java
public class PhDStudent extends Student implements Researchable {

    public PhDStudent(String name, String email, String phone) {
        super(name, email, phone, "PhD");
    }

    @Override
    public String getRole() {
        return "PhD Student";
    }

    @Override
    public void accessLibrary() {
        System.out.println("PhD student can borrow 10 books with extended period.");
    }

    // Researchable
    @Override
    public void publishPaper(String title) {
        System.out.println(getName() + " published paper: " + title);
    }

    @Override
    public void conductResearch(String topic) {
        System.out.println(getName() + " is researching: " + topic);
    }

    @Override
    public void applyForGrant(double amount) {
        System.out.println(getName() + " applied for research grant: " + amount);
    }
}
