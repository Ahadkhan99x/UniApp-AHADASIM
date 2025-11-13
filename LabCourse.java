// File: LabCourse.java
public class LabCourse extends Course {

    public LabCourse(String code, String title, int creditHours, int capacity) {
        super(code, title, creditHours, capacity);
    }

    @Override
    public double calculateFinalGrade(Student student) {
        return 90.0;
    }

    @Override
    public boolean checkPrerequisites(Student student) {
        // example: require GPA above 2.5
        return student.getGpa() >= 2.5;
    }

    @Override
    public void generateSyllabus() {
        getSyllabus().setContent("Lab work, practicals, and project.");
    }
}
