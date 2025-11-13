// File: Syllabus.java
public class Syllabus {
    private Course course;
    private String content;

    public Syllabus(Course course) {
        this.course = course;
        this.content = "";
    }

    public Course getCourse() {
        return course;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
