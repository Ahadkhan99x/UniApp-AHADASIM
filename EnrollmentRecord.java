// File: EnrollmentRecord.java
import java.util.ArrayList;
import java.util.List;

public class EnrollmentRecord {
    private Student student;              // composition
    private List<Course> currentCourses = new ArrayList<>();

    public EnrollmentRecord(Student student) {
        this.student = student;
    }

    public void addCourse(Course course) {
        currentCourses.add(course);
    }

    public void removeCourse(Course course) {
        currentCourses.remove(course);
    }

    public List<Course> getCurrentCourses() {
        return currentCourses;
    }
}
