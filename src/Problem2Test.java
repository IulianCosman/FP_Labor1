import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    @Test
    void maximaleZahl1() {
        int[] input = {3, 32, 423, 44, 66, 34, 55, 30};
        int expectedOutput = 423;
        int output = Problem2.maximaleZahl(input);
        assertEquals(expectedOutput, output);
        System.out.println("Problem2- maximaleZahl Test1 successful");
    }
    @Test
    void maximaleZahl2() {
        int[] input = {3, 32, 423, 44, 66, 34, 55, 30};
        int falseOutput = 66;
        int output = Problem2.maximaleZahl(input);
        assertNotEquals(falseOutput, output);
        System.out.println("Problem2- maximaleZahl Test2 successful");
    }
    @Test
    void maximaleZahl3() {
        int[] input = {};
        int expectedOutput = Integer.MIN_VALUE;
        int output = Problem2.maximaleZahl(input);
        assertEquals(expectedOutput, output);
        System.out.println("Problem2- maximaleZahl Test3 successful");
    }

    @Test
    void minimaleZahl() {
    }

    @Test
    void maximaleSumme() {
    }

    @Test
    void minimaleSumme() {
    }
}