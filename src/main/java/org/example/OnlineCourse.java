package org.example;

public class OnlineCourse extends Course {
    private String coursePlatform;
    private String courseMeetingCode;

    OnlineCourse(String code, String title, int capacity, String coursePlatform, String courseMeetingCode){
        super(code, title, capacity);

        this.coursePlatform = coursePlatform;
        this.courseMeetingCode = courseMeetingCode;
    }

    public String getCoursePlatform() {
        return coursePlatform;
    }

    public String getCourseMeetingCode() {
        return courseMeetingCode;
    }

    @Override
    public CourseType getCourseType() {
        return CourseType.ONLINE;
    }

    @Override
    public String getLocationDescription() {
        return "This is an online class, so you are at home.";
    }

    @Override
    public String displayInfo() {
        return String.format("Your class: %s, code: %s, that has a capacity of %d, will be held on %s, with the meeting code %s.", getTitle(), getCode(), getCapacity(), coursePlatform, courseMeetingCode);
    }
}
