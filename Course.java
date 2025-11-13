// File: Course.java
import java.util.ArrayList;
import java.util.List;

public abstract class Course {
    private String code;
    private String title;
    private int creditHours;
    private int capacity;
    private List<Student> enrolledStudents = new ArrayList<>();
    private Syllabus syllabus;        // composition
    private Professor instructor;     // aggregation

    public Course(String code, String title, int creditHours, int capacity) {
        this.code = code;
        this.title = title;
        this.creditHours = creditHours;
        this.capacity = capacity;
        this.syllabus = new Syllabus(this);
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public Syllabus getSyllabus() {
        return syllabus;
    }

    public Professor getInstructor() {
        return instructor;
    }

    public void setInstructor(Professor instructor) {
        this.instructor = instructor;
        if (instructor != null) {
            instructor.addCourse(this);
        }
    }

    public boolean addStudent(Student student) {
        if (enrolledStudents.size() >= capacity) {
            System.out.println("Course " + code + " is full.");
            return false;
        }
        if (!checkPrerequisites(student)) {
            System.out.println("Student does not meet prerequisites for " + code);
            return false;
        }
        enrolledStudents.add(student);
        return true;
    }

    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
    }

    public abstract double calculateFinalGrade(Student student);

    public abstract boolean checkPrerequisites(Student student);

    public abstract void generateSyllabus();
}
