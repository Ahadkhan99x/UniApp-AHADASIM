// File: Lecturer.java
public class Lecturer extends Faculty {

    public Lecturer(String name, String email, String phone, double salary) {
        super(name, email, phone, "Lecturer", salary);
    }

    @Override
    public String getRole() {
        return "Lecturer";
    }

    @Override
    public void teach(Course course) {
        addCourse(course);
        System.out.println("Lecturer " + getName() + " is teaching " + course.getCode());
    }

    @Override
    public void assignGrades(Course course) {
        System.out.println("Lecturer " + getName() + " is assigning grades for " + course.getCode());
    }

    @Override
    public void holdOfficeHours() {
        System.out.println("Lecturer " + getName() + " is holding office hours.");
    }
}
