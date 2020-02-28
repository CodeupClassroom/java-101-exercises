import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Java101ExerciseTest {

    @Test
    public void exercise001Test() {
        assertEquals("exercise001Test failed test 01.", 7, Java101Exercises.exercise001(3, 4));
        assertEquals("exercise001Test failed test 02.", -5, Java101Exercises.exercise001(-8, 3));
    }

    @Test
    public void exercise011Test() {
        assertEquals("exercise011Test failed test 01.",7.0, Java101Exercises.exercise011("ADD",3, 4), 0.00001);
        assertEquals("exercise011Test failed test 02.",-1.0, Java101Exercises.exercise011("SUB",3, 4), 0.00001);
        assertEquals("exercise011Test failed test 03.",12.0, Java101Exercises.exercise011("MUL",3, 4), 0.00001);
        assertEquals("exercise011Test failed test 04.",0.75, Java101Exercises.exercise011("DIV",3, 4), 0.00001);

        assertEquals("exercise011Test failed test 05.",-5.0, Java101Exercises.exercise011("ADD",-8, 3), 0.00001);
        assertEquals("exercise011Test failed test 06.",-11.0, Java101Exercises.exercise011("SUB",-8, 3), 0.00001);
        assertEquals("exercise011Test failed test 07.",-24.0, Java101Exercises.exercise011("MUL",-8, 3), 0.00001);
        assertEquals("exercise011Test failed test 08.",-2.666666, Java101Exercises.exercise011("DIV",-8, 3), 0.00001);

        assertEquals("exercise011Test failed test 09.",0.0, Java101Exercises.exercise011("MIN",-8, 3), 0.00001);
    }

    @Test
    public void exercise041Test() {
        ArrayList<Integer> input = new ArrayList();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);

        ArrayList<Integer> expected = new ArrayList();
        expected.add(120);
        expected.add(60);
        expected.add(40);
        expected.add(30);
        expected.add(24);

        List<Integer> results;
        try {
            results = Java101Exercises.exercise041(input);
            assertTrue("exercise041Test failed test 01.", expected.equals(results));
        } catch (Exception e) {
            fail("exercise041Test threw an unexpected exception on test 01");
        }

        input.clear();
        input.add(7);
        input.add(-4);
        input.add(6);
        input.add(-3);
        input.add(5);

        expected.clear();
        expected.add(360);
        expected.add(-630);
        expected.add(420);
        expected.add(-840);
        expected.add(504);

        try {
            results = Java101Exercises.exercise041(input);
            assertTrue("exercise041Test failed test 02.", expected.equals(results));
        } catch (Exception e) {
            fail("exercise041Test threw an unexpected exception on test 02");
        }

        try {
            input.clear();
            results = Java101Exercises.exercise041(input);
            fail("exercise041Test did not throw an expected exception on test 03");
        } catch (Exception e) {
            // Past test, no action required
        }

        try {
            results = Java101Exercises.exercise041(null);
            fail("exercise041Test did not throw an expected exception on test 04");
        } catch (Exception e) {
            // Past test, no action required
        }
    }
}
