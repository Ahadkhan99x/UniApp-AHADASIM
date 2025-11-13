// File: UndergraduateStudent.java
public class UndergraduateStudent extends Student {

    public UndergraduateStudent(String name, String email, String phone) {
        super(name, email, phone, "Undergraduate");
    }

    @Override
    public String getRole() {
        return "Undergraduate Student";
    }
}
