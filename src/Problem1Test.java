import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    @Test
    void nichtAusreichendeNoten1() {
        int[] input = {33, 55, 45, 34, 99, 32, 55};
        int[] expectedOutput = {33, 34, 32};
        int[] output = Problem1.nichtAusreichendeNoten(input);
        assertArrayEquals(expectedOutput, output);
        System.out.println("Problem1- nichtAusreichendeNoten Test1 successful");
    }

    @Test
    void nichtAusreichendeNoten2() {
        int[] input = {63, 55, 45, 54, 99, 72, 55};
        int[] expectedOutput = {};
        int[] output = Problem1.nichtAusreichendeNoten(input);
        assertArrayEquals(expectedOutput, output);
        System.out.println("Problem1- nichtAusreichendeNoten Test2 successful");
    }

    @Test
    void nichtAusreichendeNote3() {
        int[] input = {33, 55, 45, 34, 99, 32, 55};
        int[] falseOutput = {45, 55};
        int[] output = Problem1.nichtAusreichendeNoten(input);
        assertFalse(Arrays.equals(falseOutput, output));
        System.out.println("Problem1- nichtAusreichendeNoten Test3 successful");
    }



    @Test
    void durchschnittswert() {
    }

    @Test
    void abgerundeteNoten() {
    }

    @Test
    void maximaleAbgerundeteNote() {
    }
}
