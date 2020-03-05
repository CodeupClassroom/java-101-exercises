import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Java101ExerciseTest {
    private ArrayList<Integer> testList;

    @Test
    public void exercise001Test() {
        assertEquals("exercise001Test failed test 01.", 7, Java101Exercises.exercise001(3, 4));
        assertEquals("exercise001Test failed test 02.", -5, Java101Exercises.exercise001(-8, 3));
    }

    @Test
    public void exercise002Test() {
        int[] nums = {7, 15, 3, 6, 8};
        assertEquals("exercise002Test failed test 01.", true, Java101Exercises.exercise002(nums, 13));
        assertEquals("exercise002Test failed test 02.", false, Java101Exercises.exercise002(nums, 25));

        nums = new int[]{-3, 14, -7, 5, 19};
        assertEquals("exercise002Test failed test 03.", true, Java101Exercises.exercise002(nums, -2));
        assertEquals("exercise002Test failed test 04.", false, Java101Exercises.exercise002(nums, 13));

        nums = new int[]{2, 4, 6, 8, -10};
        assertEquals("exercise002Test failed test 05.", true, Java101Exercises.exercise002(nums, 10));
        assertEquals("exercise002Test failed test 06.", false, Java101Exercises.exercise002(nums, 11));

        nums = null;
        assertEquals("exercise002Test failed test 07.", false, Java101Exercises.exercise002(nums, 25));

        nums = new int[1];
        assertEquals("exercise002Test failed test 08.", false, Java101Exercises.exercise002(nums, 25));
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
    public void exercise012Test() {

        // test 1
        testList = Java101Exercises.exercise012(1);
        assert(testList != null);
        assertEquals(1, (long)testList.size());
        assertEquals(1, (long)testList.get(0));

        // test 2
        testList = Java101Exercises.exercise012(2);
        assert(testList != null);
        assertEquals(2, (long)testList.size());
        assertEquals(1, (long)testList.get(0));
        assertEquals(2, (long)testList.get(1));

        // test 3
        testList = Java101Exercises.exercise012(3);
        assert(testList != null);
        assertEquals(2, (long)testList.size());
        assertEquals(1, (long)testList.get(0));
        assertEquals(3, (long)testList.get(1));

        // test 9
        testList = Java101Exercises.exercise012(9);
        assert(testList != null);
        assertEquals(3, (long)testList.size(), 3);
        assertEquals(1, (long)testList.get(0), 1);
        assertEquals(3, (long)testList.get(1), 3);
        assertEquals(9, (long)testList.get(2), 9);

        // test 8
        testList = Java101Exercises.exercise012(8);
        assert(testList != null);
        assertEquals(4, (long)testList.size());
        assertEquals(1, (long)testList.get(0));
        assertEquals(2, (long)testList.get(1));
        assertEquals(4, (long)testList.get(2));
        assertEquals(8, (long)testList.get(3));

        // test 125
        testList = Java101Exercises.exercise012(125);
        assert(testList != null);
        assertEquals(4, (long)testList.size());
        assertEquals(1, (long)testList.get(0));
        assertEquals(5, (long)testList.get(1));
        assertEquals(25, (long)testList.get(2));
        assertEquals(125, (long)testList.get(3));

        // test 2080046
        testList = Java101Exercises.exercise012(2080046);
        assert(testList != null);
        // [1, 2, 359, 718, 2897, 5794, 1040023, 2080046]
        assertEquals(8, (long)testList.size());
        assertEquals(1, (long)testList.get(0));
        assertEquals(359, (long)testList.get(2));
        assertEquals(5794, (long)testList.get(5));
        assertEquals(2080046, (long)testList.get(7));
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

    @Test
    public void exercise071Test() {

        // test 1
        testList = Java101Exercises.exercise071(1);
        assert(testList != null);
        assertEquals(1, (long)testList.size());
        assertEquals(1, (long)testList.get(0));

        // test 2
        testList = Java101Exercises.exercise071(2);
        assert(testList != null);
        assertEquals(2, (long)testList.size());
        assertEquals(1, (long)testList.get(0));
        assertEquals(2, (long)testList.get(1));

        // test 3
        testList = Java101Exercises.exercise071(3);
        assert(testList != null);
        assertEquals(2, (long)testList.size());
        assertEquals(1, (long)testList.get(0));
        assertEquals(3, (long)testList.get(1));

        // test -3
        testList = Java101Exercises.exercise071(-3);
        assert(testList != null);
        assertEquals(4, (long)testList.size());
        assertEquals(-3, (long)testList.get(0));
        assertEquals(-1, (long)testList.get(1));
        assertEquals(1, (long)testList.get(2));
        assertEquals(3, (long)testList.get(3));

        // test 9
        testList = Java101Exercises.exercise071(9);
        assert(testList != null);
        assertEquals(3, (long)testList.size(), 3);
        assertEquals(1, (long)testList.get(0), 1);
        assertEquals(3, (long)testList.get(1), 3);
        assertEquals(9, (long)testList.get(2), 9);

        // test 8
        testList = Java101Exercises.exercise071(8);
        assert(testList != null);
        assertEquals(4, (long)testList.size());
        assertEquals(1, (long)testList.get(0));
        assertEquals(2, (long)testList.get(1));
        assertEquals(4, (long)testList.get(2));
        assertEquals(8, (long)testList.get(3));

        // test 125
        testList = Java101Exercises.exercise071(125);
        assert(testList != null);
        assertEquals(4, (long)testList.size());
        assertEquals(1, (long)testList.get(0));
        assertEquals(5, (long)testList.get(1));
        assertEquals(25, (long)testList.get(2));
        assertEquals(125, (long)testList.get(3));

        // test -125
        testList = Java101Exercises.exercise071(-125);
        assert(testList != null);
        assertEquals(8, (long)testList.size());
        assertEquals(-125, (long)testList.get(0));
        assertEquals(-5, (long)testList.get(2));
        assertEquals(5, (long)testList.get(5));
        assertEquals(125, (long)testList.get(7));

        // test 2080046
        // also test time
        long startTime = System.nanoTime();
        testList = Java101Exercises.exercise071(2080046);
        assert(testList != null);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        assertTrue("The algorithm takes too long to complete", duration < 200000);

        // [1, 2, 359, 718, 2897, 5794, 1040023, 2080046]
        assertEquals(8, (long)testList.size());
        assertEquals(1, (long)testList.get(0));
        assertEquals(359, (long)testList.get(2));
        assertEquals(5794, (long)testList.get(5));
        assertEquals(2080046, (long)testList.get(7));
    }
}
