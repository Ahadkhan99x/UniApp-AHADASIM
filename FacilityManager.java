// File: FacilityManager.java
public class FacilityManager {
    public void assignClassroomToCourse(Classroom classroom, Course course) {
        System.out.println("Assigned classroom " + classroom.getRoomNumber() +
                " to course " + course.getCode());
    }

    public void assignLabToCourse(Lab lab, Course course) {
        System.out.println("Assigned lab " + lab.getLabName() +
                " to course " + course.getCode());
    }

    public void assignOfficeToFaculty(OfficeRoom officeRoom, Faculty faculty) {
        faculty.setOfficeRoom(officeRoom);
        System.out.println("Assigned office " + officeRoom.getRoomNumber() +
                " to " + faculty.getName());
    }
}
