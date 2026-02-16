package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnrollmentManagerTest {
    @Test
    void testAddCourseMethodsAddsCourseToFirstEmptyIndexInArray() {
        EnrollmentManager test = new EnrollmentManager(3);

        test.addCourse(new InPersonCourse("CS001", "Intro to computer science", 50, "D", 250 ));
        assertEquals("Your course, Intro to computer science, code: CS001, has a capacity of 50 and is in room 250 in building D", test.getCourseByIndex(0).displayInfo());
    }



}