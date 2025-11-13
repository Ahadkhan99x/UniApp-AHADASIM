// File: AssistantProfessor.java
public class AssistantProfessor extends Faculty {

    public AssistantProfessor(String name, String email, String phone, double salary) {
        super(name, email, phone, "Assistant Professor", salary);
    }

    @Override
    public String getRole() {
        return "Assistant Professor";
    }

    @Override
    public void teach(Course course) {
        addCourse(course);
        System.out.println("Assistant Professor " + getName() + " is teaching " + course.getCode());
    }

    @Override
    public void assignGrades(Course course) {
        System.out.println("Assistant Professor " + getName() + " is assigning grades for " + course.getCode());
    }

    @Override
    public void holdOfficeHours() {
        System.out.println("Assistant Professor " + getName() + " is holding office hours.");
    }
}
