// File: Department.java
import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Faculty> facultyMembers = new ArrayList<>();
    private List<Course> coursesOffered = new ArrayList<>();
    private Budget budget;                         // composition

    public Department(String name, double initialBudget) {
        this.name = name;
        this.budget = new Budget(this, initialBudget);
    }

    public String getName() {
        return name;
    }

    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void addCourse(Course course) {
        coursesOffered.add(course);
    }

    public List<Faculty> getFacultyMembers() {
        return facultyMembers;
    }

    public List<Course> getCoursesOffered() {
        return coursesOffered;
    }

    public Budget getBudget() {
        return budget;
    }
}
