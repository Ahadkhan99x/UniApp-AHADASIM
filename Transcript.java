// File: Transcript.java
import java.util.ArrayList;
import java.util.List;

public class Transcript {
    private Student owner;                 // composition owner
    private List<GradeEntry> grades = new ArrayList<>();

    public Transcript(Student owner) {
        this.owner = owner;
    }

    public void addGrade(Course course, String letterGrade) {
        grades.add(new GradeEntry(course, letterGrade));
    }

    public double calculateGPA() {
        if (grades.isEmpty()) return 0.0;

        double totalPoints = 0;
        int totalCredits = 0;

        for (GradeEntry g : grades) {
            double points = letterToPoints(g.getLetterGrade());
            int credits = g.getCourse().getCreditHours();
            totalPoints += points * credits;
            totalCredits += credits;
        }

        return totalCredits == 0 ? 0.0 : totalPoints / totalCredits;
    }

    private double letterToPoints(String letter) {
        switch (letter.toUpperCase()) {
            case "A": return 4.0;
            case "B": return 3.0;
            case "C": return 2.0;
            case "D": return 1.0;
            default:  return 0.0;
        }
    }
}
