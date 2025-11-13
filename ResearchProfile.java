// File: ResearchProfile.java
import java.util.ArrayList;
import java.util.List;

public class ResearchProfile {
    private Faculty faculty;
    private List<String> projects = new ArrayList<>();
    private List<String> publications = new ArrayList<>();

    public ResearchProfile(Faculty faculty) {
        this.faculty = faculty;
    }

    public void addProject(String topic) {
        projects.add(topic);
        System.out.println("Research project added for " + faculty.getName() + ": " + topic);
    }

    public void addPublication(String title) {
        publications.add(title);
        System.out.println("Publication added for " + faculty.getName() + ": " + title);
    }
}
