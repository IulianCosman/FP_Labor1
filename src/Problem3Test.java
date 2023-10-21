import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void summe1() {
        int[] number1 = {3, 4, 5, 3, 4, 8, 9, 0};
        int[] number2 = {5, 2, 3, 2, 6, 4, 9, 7};
        int[] expectedOutput = {8, 6, 8, 7, 1, 3, 8, 7};
        int[] output = Problem3.summe(number1, number2);
        assertArrayEquals(expectedOutput, output);
        System.out.println("Problem3- summe Test1 successful");
    }

    @Test
    void differenz() {
    }

    @Test
    void multiplikation() {
    }

    @Test
    void division() {
    }
}