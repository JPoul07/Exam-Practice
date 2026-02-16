package org.example;

public abstract class Course {
    protected String code;
    protected String title;
    protected int capacity;

    Course(String code, String title, int capacity) {
        this.code = code;
        this.title = title;
        this.capacity = capacity;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public int getCapacity() {
        return capacity;
    }

    public String setCode(String newCode) {
        code = newCode;
        return code;
    }

    public String setTitle(String newTitle) {
        title = newTitle;
        return title;
    }

    public int setCapacity(int newCapacity) {
        capacity = newCapacity;
        return capacity;
    }

    public abstract CourseType getCourseType();

    public abstract String getLocationDescription();

    public abstract String displayInfo();
}
