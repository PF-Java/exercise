import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NameClassCodeGymTest {
    NameClassCodeGym nameClassCodeGym = new NameClassCodeGym();

    @Test
    @DisplayName("Test C0618G1")
    void validate() {
        String nameClass = "C0618G1";
        boolean expected = true;
        boolean result = nameClassCodeGym.validate(nameClass);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test K0618G1")
    void validate1() {
        String nameClass = "C0618G";
        boolean expected = false;
        boolean result = nameClassCodeGym.validate(nameClass);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test C071G1")
    void validate2() {
        String nameClass = "C071G1";
        boolean expected = false;
        boolean result = nameClassCodeGym.validate(nameClass);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test C0618GA")
    void validate3() {
        String nameClass = "C0618GA";
        boolean expected = false;
        boolean result = nameClassCodeGym.validate(nameClass);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test C0618G")
    void validate4() {
        String nameClass = "C0618G";
        boolean expected = false;
        boolean result = nameClassCodeGym.validate(nameClass);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test C0618J1")
    void validate5() {
        String nameClass = "C0618J1";
        boolean expected = false;
        boolean result = nameClassCodeGym.validate(nameClass);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test X0618G1")
    void validate6() {
        String nameClass = "X0618G";
        boolean expected = false;
        boolean result = nameClassCodeGym.validate(nameClass);
        assertEquals(expected, result);
    }
}