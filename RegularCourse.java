// File: RegularCourse.java
public class RegularCourse extends Course {

    public RegularCourse(String code, String title, int creditHours, int capacity) {
        super(code, title, creditHours, capacity);
    }

    @Override
    public double calculateFinalGrade(Student student) {
        // simple fixed grade for demo
        return 85.0;
    }

    @Override
    public boolean checkPrerequisites(Student student) {
        // simple demo: always true
        return true;
    }

    @Override
    public void generateSyllabus() {
        getSyllabus().setContent("Standard theory + assignments + final exam.");
    }
}
