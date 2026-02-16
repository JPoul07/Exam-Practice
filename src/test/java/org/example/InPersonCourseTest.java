package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InPersonCourseTest {
    @Test
    void testGetterMethodsReturnAttributesInConstructor() {
        InPersonCourse testCourse = new InPersonCourse("CS001", "Intro to Computer Science", 55, "Jean-Baptiste", 150);

        assertEquals("Jean-Baptiste", testCourse.getBuilding());
        assertEquals(150, testCourse.getRoomNumber());
    }

    @Test
    void testGetCourseTypeReturnsCourseTypeEnumInPerson() {
        InPersonCourse testCourse = new InPersonCourse("CS001", "Intro to Computer Science", 55, "Jean-Baptiste", 150);

        assertEquals(CourseType.IN_PERSON, testCourse.getCourseType());
    }

    @Test
    void testGetLocationDescriptionMethodReturnsFormatedString() {
        InPersonCourse testCourse = new InPersonCourse("CS001", "Intro to Computer Science", 55, "Jean-Baptiste", 150);
        String expectedResult = "This course is in building Jean-Baptiste in room number 150";

        assertEquals(expectedResult, testCourse.getLocationDescription());
    }

    @Test
    void testDisplayInfoMethodReturnsFormatedStringWithValidAttributes() {
        InPersonCourse testCourse = new InPersonCourse("CS001", "Intro to Computer Science", 55, "Jean-Baptiste", 150);

        String expectedResult = "Your course, Intro to Computer Science, code: CS001, has a capacity of 55 and is in room 150 in building Jean-Baptiste";
        assertEquals(expectedResult, testCourse.displayInfo());
    }
}