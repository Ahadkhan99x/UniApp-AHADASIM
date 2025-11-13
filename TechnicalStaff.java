// File: TechnicalStaff.java
public class TechnicalStaff extends Staff {

    public TechnicalStaff(String name, String email, String phone, double salary) {
        super(name, email, phone, "Technical Staff", salary);
    }

    @Override
    public String getRole() {
        return "Technical Staff";
    }
}
