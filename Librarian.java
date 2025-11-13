// File: Librarian.java
public class Librarian extends Staff {

    public Librarian(String name, String email, String phone, double salary) {
        super(name, email, phone, "Librarian", salary);
    }

    @Override
    public String getRole() {
        return "Librarian";
    }
}
