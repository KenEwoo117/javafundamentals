package com.fundementals.lessons;

import com.fundamentals.main.House;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/* Writing Unit Tests*/
public class Lesson19Test {

    Lesson19 myLesson19;
    House myHouse;

    @BeforeEach
    void setup() {
        myLesson19 = new Lesson19();
    }

    @Test
    void testCalculateArea() {
        double actualArea = myLesson19.calculateArea(1);
        double expectedArea =3.141592653589793;
        assertEquals(expectedArea, actualArea, "Value failed to match");
    }

    @Test
    void testCharExample() {
        char[] actual = myLesson19.myCharExample();
        char[] expecting = "UnitTest".toCharArray();
        assertArrayEquals(expecting,actual, "Arrays should be equal");
    }

    @Test
    void testIsGreaterTrue() {
        assertTrue(myLesson19.isGreaterExample(7,3), "7 is greater than 3");
    }

    @Test
    void testIsGreaterFalse(){
        assertFalse(myLesson19.isGreaterExample(3,7), "3 is less than 7");
    }

    @Test
    void testHouseNull() {
        assertNull(myLesson19.myHouseExample(myHouse), "House is null");
    }

    @Test
    void testHouseNotNull() {
        myHouse = new House();
        assertNotNull(myLesson19.myHouseExample(myHouse), "House is not null");
    }

}
