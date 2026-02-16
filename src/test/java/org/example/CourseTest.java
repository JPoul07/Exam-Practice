package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    private static class TestCourse extends Course {
        public TestCourse(String code, String title, int capacity) {
            super(code, title, capacity);
        }

        @Override
        public CourseType getCourseType() {
            return null;
        }

        @Override
        public String getLocationDescription() {
            return "";
        }

        @Override
        public String displayInfo() {
            return "";
        }
    }

    @Test
    void testGettersReturnAllProperAttributes() {
        TestCourse test = new TestCourse("CS001", "Intro to computer Science", 35);

        assertEquals("CS001", test.getCode());
        assertEquals("Intro to computer Science", test.getTitle());
        assertEquals(35, test.getCapacity());
    }

    @Test
    void testSettersReturnUpdatedValuesForChangedAttributesAndSetsThemAsAttribute() {
        TestCourse test = new TestCourse("CS001", "Intro to computer Science", 35);

        assertEquals("CS003", test.setCode("CS003"));
        assertEquals("CS003", test.getCode());
        assertEquals("Programming basics", test.setTitle("Programming basics"));
        assertEquals("Programming basics", test.getTitle());
        assertEquals(50, test.setCapacity(50));
        assertEquals(50, test.getCapacity());
    }


}