// File: Professor.java
public class Professor extends Faculty {

    public Professor(String name, String email, String phone, double salary) {
        super(name, email, phone, "Professor", salary);
    }

    @Override
    public String getRole() {
        return "Professor";
    }

    @Override
    public void teach(Course course) {
        addCourse(course);
        System.out.println("Professor " + getName() + " is teaching " + course.getCode());
    }

    @Override
    public void assignGrades(Course course) {
        System.out.println("Professor " + getName() + " is assigning grades for " + course.getCode());
    }

    @Override
    public void holdOfficeHours() {
        System.out.println("Professor " + getName() + " is holding office hours.");
    }
}
