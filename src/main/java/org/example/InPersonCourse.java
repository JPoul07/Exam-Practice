package org.example;

public class InPersonCourse extends Course {
    private String building;

    private int roomNumber;

    InPersonCourse(String code, String title, int capacity, String building, int roomNumber) {
        super(code, title, capacity);
        this.building = building;
        this.roomNumber = roomNumber;
    }

    @Override
    public CourseType getCourseType() {
        return CourseType.IN_PERSON;
    }

    @Override
    public String getLocationDescription() {
        return String.format("This course is in building %s in room number %d", building, roomNumber );
    }

    @Override
    public String displayInfo() {
        return String.format("Your course, %s, code: %s, has a capacity of %d and is in room %d in building %s", getTitle(), getCode(), getCapacity(), roomNumber, building);
    }
}
