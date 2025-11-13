// File: SmartUniversityApp.java
public class SmartUniversityApp {
    public static void main(String[] args) {
        // Departments
        Department csDept = new Department("Computer Science", 2_000_000);

        // Faculty
        Professor profAli = new Professor("Dr. Ali", "ali@uni.edu", "0300-1111111", 350000);
        csDept.addFaculty(profAli);

        // Students
        UndergraduateStudent ugStudent = new UndergraduateStudent("Aisha", "aisha@uni.edu", "0300-2222222");
        PhDStudent phdStudent = new PhDStudent("Bilal", "bilal@uni.edu", "0300-3333333");

        // Courses
        RegularCourse cs101 = new RegularCourse("CS101", "Intro to CS", 3, 50);
        LabCourse cs101L = new LabCourse("CS101L", "Intro to CS Lab", 1, 25);

        csDept.addCourse(cs101);
        csDept.addCourse(cs101L);

        cs101.setInstructor(profAli);
        cs101L.setInstructor(profAli);

        // Facility
        FacilityManager facilityManager = new FacilityManager();
        Classroom roomA = new Classroom("A-101", 60);
        Lab lab1 = new Lab("CS Lab 1", 30);
        OfficeRoom office1 = new OfficeRoom("CS-201");

        facilityManager.assignClassroomToCourse(roomA, cs101);
        facilityManager.assignLabToCourse(lab1, cs101L);
        facilityManager.assignOfficeToFaculty(office1, profAli);

        // Library
        Library library = new Library();
        library.addBook(new Book("ISBN-1", "OOP in Java", "Some Author"));
        library.addBook(new Book("ISBN-2", "Data Structures", "Another Author"));

        // Financial / HR
        Administrator admin = new Administrator("Imran", "imran@uni.edu", "0300-4444444", 120000);
        TechnicalStaff tech = new TechnicalStaff("Sara", "sara@uni.edu", "0300-5555555", 90000);

        // Test: registration & dashboards
        ugStudent.register();
        profAli.register();
        admin.register();

        ugStudent.displayDashboard();
        profAli.displayDashboard();
        admin.displayDashboard();

        // Enrollment scenarios
        ugStudent.enrollInCourse(cs101);
        ugStudent.enrollInCourse(cs101L);

        phdStudent.enrollInCourse(cs101);

        ugStudent.viewSchedule();
        phdStudent.viewSchedule();

        // Grades and GPA
        ugStudent.updateGrade(cs101, "A");
        ugStudent.updateGrade(cs101L, "B");
        System.out.println("Aisha GPA: " + ugStudent.getGpa());

        // Library interactions
        library.borrowBook(ugStudent, "ISBN-1");
        library.borrowBook(profAli, "ISBN-2");
        library.returnBook(ugStudent, "ISBN-1");

        // Research
        profAli.conductResearch("AI in Education");
        phdStudent.conductResearch("Deep Learning for Images");
        phdStudent.publishPaper("A Study on CNN");

        // Payments
        System.out.println(ugStudent.generateInvoice());
        ugStudent.processPayment(ugStudent.calculatePayments());

        profAli.processPayment(profAli.calculatePayments());
        System.out.println(profAli.getFinancialSummary());

        // Access library polymorphism
        ugStudent.accessLibrary();
        profAli.accessLibrary();
        phdStudent.accessLibrary();
        admin.accessLibrary();
    }
}
