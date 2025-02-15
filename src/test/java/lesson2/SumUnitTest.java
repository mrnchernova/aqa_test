package lesson2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled
public class SumUnitTest {
    int a = 3;
    int b = 2;

    @Test
    void sumUnitTest() {
        int actualSum = a + b;
        int expectedSum = 5;

        assertEquals(expectedSum, actualSum);
    }

    @Test
    @DisplayName("True False test")
    void assertTrueFalse(){
        int actualSum = a + b;
        int expectedSum = 5;
        assertTrue(expectedSum == actualSum);
        assertFalse(expectedSum != actualSum);
    }

    @Test
    void exceptionTest(){
        String s = null;
        Exception thrown = assertThrows(NullPointerException.class, () -> s.length());

        Assertions.assertEquals("Cannot invoke \"String.length()\" because \"s\" is null", thrown.getMessage());

    }
}
