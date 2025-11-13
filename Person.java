// File: Person.java
import java.util.UUID;

public abstract class Person {
    private String id;
    private String name;
    private String email;
    private String phone;

    public Person(String name, String email, String phone) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // Encapsulation: only getters / controlled setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void updateName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void updateEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void updatePhone(String phone) {
        this.phone = phone;
    }

    // Abstraction contracts
    public abstract void register();
    public abstract boolean login(String email, String password);
    public abstract String getPermissions();
    public abstract double calculatePayments(); // fee or salary

    // Polymorphic behaviour
    public abstract String getRole();
    public abstract int calculateWorkload();
    public abstract void displayDashboard();

    // Can be overridden for different roles
    public void accessLibrary() {
        System.out.println(getRole() + " accessing library with default privileges.");
    }
}
