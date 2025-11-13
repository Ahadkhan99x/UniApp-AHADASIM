// File: Administrator.java
public class Administrator extends Staff {

    public Administrator(String name, String email, String phone, double salary) {
        super(name, email, phone, "Administrator", salary);
    }

    @Override
    public String getRole() {
        return "Administrator";
    }
}
