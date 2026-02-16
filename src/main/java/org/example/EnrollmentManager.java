package org.example;

public class EnrollmentManager {
    private Course[] courses;

    EnrollmentManager(int numberOfCourses) {
        courses = new Course[numberOfCourses];
        if (numberOfCourses < 0) {
            throw new IllegalArgumentException("You can not have less than 0 courses.");
        }
    }

    public Course[] getCourses() {
        return courses;
    }

    public Course getCourseByIndex(int index) {
        return courses[index];
    }

    public void addCourse(Course courseToAdd) {
        int index =  findFirstEmptyIndex();
        courses[index] = courseToAdd;
    }

    public int findFirstEmptyIndex() {
        int index = 0;

        for(index = 0; index < courses.length; index ++) {
            if (courses[index] == null) {
                break;
            }
        }
        return index;
    }


}
