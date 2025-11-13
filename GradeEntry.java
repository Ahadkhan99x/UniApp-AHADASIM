// File: GradeEntry.java
public class GradeEntry {
    private Course course;
    private String letterGrade;

    public GradeEntry(Course course, String letterGrade) {
        this.course = course;
        this.letterGrade = letterGrade;
    }

    public Course getCourse() {
        return course;
    }

    public String getLetterGrade() {
        return letterGrade;
    }
}
