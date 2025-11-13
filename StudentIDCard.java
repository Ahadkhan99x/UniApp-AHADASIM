// File: StudentIDCard.java
public class StudentIDCard {
    private Student student;
    private String cardNumber;

    public StudentIDCard(Student student) {
        this.student = student;
        this.cardNumber = "CARD-" + student.getId();
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
