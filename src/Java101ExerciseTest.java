import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class Java101ExerciseTest {
    private ArrayList<Integer> testList;

    @Test
    public void exercise001Test() {
        assertEquals("Java101Exercises.addInts001(3, 4) failed", 7, Java101Exercises.addInts001(3, 4));
        assertEquals("Java101Exercises.addInts001(-8, 3) failed", -5, Java101Exercises.addInts001(-8, 3));
    }

    @Test
    public void exercise002Test() {
        assertEquals("Java101Exercises.sayHello002(\"James\") failed", "Hello James!", Java101Exercises.sayHello002("James"));
        assertEquals("Java101Exercises.sayHello002(\"Miguel\") failed", "Hello Miguel!", Java101Exercises.sayHello002("Miguel"));
        assertEquals("Java101Exercises.sayHello002(\"\") failed", "Hello !", Java101Exercises.sayHello002(""));
        assertEquals("Java101Exercises.sayHello002(null) failed", "Hello null!", Java101Exercises.sayHello002(null));
    }

    @Test
    public void exercise003Test() {
        String[] codeup = Java101Exercises.sayCodeup003();
        assertEquals("Java101Exercises.sayCodeup003() failed on test 01",
                "* * * * *                 * *             * * * * * * *          * * * * * * * *     *                 *      * * * * * *",
                codeup[0].trim());
        assertEquals("Java101Exercises.sayCodeup003() failed on test 02",
                "*           *            *       *          *             *        *                   *                 *      *           *",
                codeup[1].trim());
        assertEquals("Java101Exercises.sayCodeup003() failed on test 03",
                "*               *       *             *       *              *       *                   *                 *      *            *",
                codeup[2].trim());
        assertEquals("Java101Exercises.sayCodeup003() failed on test 04",
                "*                        *               *      *               *      *                   *                 *      *           *",
                codeup[3].trim());
        assertEquals("Java101Exercises.sayCodeup003() failed on test 05",
                "*                        *               *      *               *      * * * * * * *       *                 *      * * * * * *",
                codeup[4].trim());
        assertEquals("Java101Exercises.sayCodeup003() failed on test 06",
                "*                        *               *      *               *      *                   *                 *      *",
                codeup[5].trim());
        assertEquals("Java101Exercises.sayCodeup003() failed on test 07",
                "*               *       *             *       *              *       *                    *               *       *",
                codeup[6].trim());
        assertEquals("Java101Exercises.sayCodeup003() failed on test 08",
                "*           *            *       *          *             *        *                       *         *          *",
                codeup[7].trim());
        assertEquals("Java101Exercises.sayCodeup003() failed on test 09",
                "* * * * *                 * *             * * * * * * *          * * * * * * * *            * * *             *",
                codeup[8].trim());
    }

    @Test
    public void exercise004Test() {
        assertEquals("Java101Exercises.addDouble004(3.5, 4.7) failed",
                8.2, Java101Exercises.addDouble004(3.5, 4.7), 0.000001);
        assertEquals("Java101Exercises.addDouble004(-8.2, 3.7) failed",
                -4.6, Java101Exercises.addDouble004(-8.3, 3.7), 0.000001);
    }

    @Test
    public void exercise005Test() {
        assertTrue("Java101Exercises.concatenateStrings005(\"Marilyn\", \"Monre\") failed",
                "Marilyn Monre".equals(Java101Exercises.concatenateStrings005("Marilyn", "Monre")));
        assertTrue("Java101Exercises.concatenateStrings005(\"Henry\", \"Ford\") failed",
                "Henry Ford".equals(Java101Exercises.concatenateStrings005("Henry", "Ford")));
    }

    @Test
    public void exercise011Test() {
        assertEquals("exercise011Test failed test 01.",7.0, Java101Exercises.preformIndicatedOperation011("ADD",3, 4), 0.00001);
        assertEquals("exercise011Test failed test 02.",-1.0, Java101Exercises.preformIndicatedOperation011("SUB",3, 4), 0.00001);
        assertEquals("exercise011Test failed test 03.",12.0, Java101Exercises.preformIndicatedOperation011("MUL",3, 4), 0.00001);
        assertEquals("exercise011Test failed test 04.",0.75, Java101Exercises.preformIndicatedOperation011("DIV",3, 4), 0.00001);

        assertEquals("exercise011Test failed test 05.",-5.0, Java101Exercises.preformIndicatedOperation011("ADD",-8, 3), 0.00001);
        assertEquals("exercise011Test failed test 06.",-11.0, Java101Exercises.preformIndicatedOperation011("SUB",-8, 3), 0.00001);
        assertEquals("exercise011Test failed test 07.",-24.0, Java101Exercises.preformIndicatedOperation011("MUL",-8, 3), 0.00001);
        assertEquals("exercise011Test failed test 08.",-2.666666, Java101Exercises.preformIndicatedOperation011("DIV",-8, 3), 0.00001);

        assertEquals("exercise011Test failed test 09.",0.0, Java101Exercises.preformIndicatedOperation011("MIN",-8, 3), 0.00001);
    }

    @Test
    public void exercise012Test() {

        // test 1
        testList = Java101Exercises.findFactors012(1);
        assert(testList != null);
        assertEquals(1, (long)testList.size());
        assertEquals(1, (long)testList.get(0));

        // test 2
        testList = Java101Exercises.findFactors012(2);
        assert(testList != null);
        assertEquals(2, (long)testList.size());
        assertEquals(1, (long)testList.get(0));
        assertEquals(2, (long)testList.get(1));

        // test 3
        testList = Java101Exercises.findFactors012(3);
        assert(testList != null);
        assertEquals(2, (long)testList.size());
        assertEquals(1, (long)testList.get(0));
        assertEquals(3, (long)testList.get(1));

        // test 9
        testList = Java101Exercises.findFactors012(9);
        assert(testList != null);
        assertEquals(3, (long)testList.size(), 3);
        assertEquals(1, (long)testList.get(0), 1);
        assertEquals(3, (long)testList.get(1), 3);
        assertEquals(9, (long)testList.get(2), 9);

        // test 8
        testList = Java101Exercises.findFactors012(8);
        assert(testList != null);
        assertEquals(4, (long)testList.size());
        assertEquals(1, (long)testList.get(0));
        assertEquals(2, (long)testList.get(1));
        assertEquals(4, (long)testList.get(2));
        assertEquals(8, (long)testList.get(3));

        // test 125
        testList = Java101Exercises.findFactors012(125);
        assert(testList != null);
        assertEquals(4, (long)testList.size());
        assertEquals(1, (long)testList.get(0));
        assertEquals(5, (long)testList.get(1));
        assertEquals(25, (long)testList.get(2));
        assertEquals(125, (long)testList.get(3));

        // test 2080046
        testList = Java101Exercises.findFactors012(2080046);
        assert(testList != null);
        // [1, 2, 359, 718, 2897, 5794, 1040023, 2080046]
        assertEquals(8, (long)testList.size());
        assertEquals(1, (long)testList.get(0));
        assertEquals(359, (long)testList.get(2));
        assertEquals(5794, (long)testList.get(5));
        assertEquals(2080046, (long)testList.get(7));
    }

    @Test
    public void exercise013Test() {
        double p1 = 0.4;
        double p2 = 0.3;
        assertEquals("exercise003 Test failed test 01.", 1, Java101Exercises.getNearestIntegerToRealSum013(p1, p2));
        assertEquals("exercise003 Test failed test 02.", 0, Java101Exercises.getNearestIntegerToRealSum013(p1, -p2));
        assertEquals("exercise003 Test failed test 03.", -1, Java101Exercises.getNearestIntegerToRealSum013(-p1, -p2));

        p1 = -3.2;
        p2 = -2.3;
        assertEquals("exercise003 Test failed test 04.", -6, Java101Exercises.getNearestIntegerToRealSum013(p1, p2));
        assertEquals("exercise003 Test failed test 05.", -1, Java101Exercises.getNearestIntegerToRealSum013(p1, -p2));
        assertEquals("exercise003 Test failed test 06.", 6, Java101Exercises.getNearestIntegerToRealSum013(-p1, -p2));

        p1 = 13.8;
        p2 = -17.3;
        assertEquals("exercise003 Test failed test 07.", -4, Java101Exercises.getNearestIntegerToRealSum013(p1, p2));
        assertEquals("exercise003 Test failed test 08.", 31, Java101Exercises.getNearestIntegerToRealSum013(p1, -p2));
        assertEquals("exercise003 Test failed test 09.", 4, Java101Exercises.getNearestIntegerToRealSum013(-p1, -p2));
    }

    @Test
    public void exercise014Test() {
        // int test
        assertEquals("Java101Exercises.isNumber014(\"3\") Failed", true,
                Java101Exercises.isNumber014("3"));
        assertEquals("Java101Exercises.isNumber014(\"   +3   \") Failed", true,
                Java101Exercises.isNumber014("   +3   "));
        assertEquals("Java101Exercises.isNumber014(\" -3\") Failed", true,
                Java101Exercises.isNumber014(" -3"));
        assertEquals("Java101Exercises.isNumber014(\"0\") Failed", true,
                Java101Exercises.isNumber014("0"));

        // real test
        assertEquals("Java101Exercises.isNumber014(\"3.14159\") Failed", true,
                Java101Exercises.isNumber014("3.14159"));
        assertEquals("Java101Exercises.isNumber014(\"   -3.14159 \") Failed", true,
                Java101Exercises.isNumber014("  -3.14159 "));
        assertEquals("Java101Exercises.isNumber014(\" +3.14159  \") Failed", true,
                Java101Exercises.isNumber014(" +3.14159  "));
        assertEquals("Java101Exercises.isNumber014(\"0.0\") Failed", true,
                Java101Exercises.isNumber014("0.0"));

        // random test
        for (int i = 1; i < 10; i++) {
            double x = (Math.random() * 201) - 100;
            long l = (long) x;
            String ds = Double.toString(x);
            String ls = Long.toString(l);
            assertEquals("Java101Exercises.isNumber014(\"" + ds + "\") Failed", true,
                    Java101Exercises.isNumber014(ds));
            assertEquals("Java101Exercises.isNumber014(\"" + ls + "\") Failed", true,
                    Java101Exercises.isNumber014(ls));
        }

        // non-numeric test
        assertEquals("Java101Exercises.isNumber014(\"is not a number\") Failed", false,
                Java101Exercises.isNumber014("is not a number"));
        assertEquals("Java101Exercises.isNumber014(\"3 .14159\") Failed", false,
                Java101Exercises.isNumber014("3 .14159"));
        assertEquals("Java101Exercises.isNumber014(\"+ 3.14159\") Failed", false,
                Java101Exercises.isNumber014("+ 3.14159"));
        assertEquals("Java101Exercises.isNumber014(\"3.141.59\") Failed", false,
                Java101Exercises.isNumber014("3.141.59"));
        assertEquals("Java101Exercises.isNumber014(\"\") Failed", false,
                Java101Exercises.isNumber014(""));
        assertEquals("Java101Exercises.isNumber014(\"zero\") Failed", false,
                Java101Exercises.isNumber014("zero"));
    }

    @Test
    public void exercise015Test() {
        int[] nums = {7, 15, 3, 6, 8};
        assertEquals("findTwoAddends015 failed test 01.", true, Java101Exercises.findTwoAddends015(nums, 13));
        assertEquals("findTwoAddends015 failed test 02.", false, Java101Exercises.findTwoAddends015(nums, 25));

        nums = new int[]{-3, 14, -7, 5, 19};
        assertEquals("findTwoAddends015 failed test 03.", true, Java101Exercises.findTwoAddends015(nums, -2));
        assertEquals("findTwoAddends015 failed test 04.", false, Java101Exercises.findTwoAddends015(nums, 13));

        nums = new int[]{2, 4, 6, 8, -10};
        assertEquals("findTwoAddends015 failed test 05.", true, Java101Exercises.findTwoAddends015(nums, 10));
        assertEquals("findTwoAddends015 failed test 06.", false, Java101Exercises.findTwoAddends015(nums, 11));

        nums = null;
        assertEquals("findTwoAddends015 failed test 07.", false, Java101Exercises.findTwoAddends015(nums, 25));

        nums = new int[1];
        assertEquals("findTwoAddends015 failed test 08.", false, Java101Exercises.findTwoAddends015(nums, 25));
    }

    @Test
    public void exercise016Test() {
        int[] nums = {7, 15, 3, 6, 8};
        assertEquals("countInversionsInArray016 failed test 01.", 5, Java101Exercises.countInversionsInArray016(nums));

        nums = new int[]{-3, 14, -7, 5, 19};
        assertEquals("countInversionsInArray016 failed test 02.", 3, Java101Exercises.countInversionsInArray016(nums));

        nums = new int[]{2, 4, 6, 8, -10};
        assertEquals("countInversionsInArray016 failed test 03.", 4, Java101Exercises.countInversionsInArray016(nums));

        nums = new int[]{2, 4, 6, 8, 10};
        assertEquals("countInversionsInArray016 failed test 04.", 0, Java101Exercises.countInversionsInArray016(nums));

        nums = new int[]{10, 8, 6, 4, 2};
        assertEquals("countInversionsInArray016 failed test 05.", 10, Java101Exercises.countInversionsInArray016(nums));

        nums = null;
        assertEquals("countInversionsInArray016 failed test 06.", 0, Java101Exercises.countInversionsInArray016(nums));

        nums = new int[1];
        assertEquals("countInversionsInArray016 failed test 07.", 0, Java101Exercises.countInversionsInArray016(nums));
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
            results = Java101Exercises.multiplyElementsOfList041(input);
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
            results = Java101Exercises.multiplyElementsOfList041(input);
            assertTrue("exercise041Test failed test 02.", expected.equals(results));
        } catch (Exception e) {
            fail("exercise041Test threw an unexpected exception on test 02");
        }

        try {
            input.clear();
            results = Java101Exercises.multiplyElementsOfList041(input);
            fail("exercise041Test did not throw an expected exception on test 03");
        } catch (Exception e) {
            // Past test, no action required
        }

        try {
            results = Java101Exercises.multiplyElementsOfList041(null);
            fail("exercise041Test did not throw an expected exception on test 04");
        } catch (Exception e) {
            // Past test, no action required
        }
    }

    @Test
    public void exercise071Test() {

        // test 1
        testList = Java101Exercises.findFactorsEfficiently071(1);
        assert(testList != null);
        assertEquals(1, (long)testList.size());
        assertEquals(1, (long)testList.get(0));

        // test 2
        testList = Java101Exercises.findFactorsEfficiently071(2);
        assert(testList != null);
        assertEquals(2, (long)testList.size());
        assertEquals(1, (long)testList.get(0));
        assertEquals(2, (long)testList.get(1));

        // test 3
        testList = Java101Exercises.findFactorsEfficiently071(3);
        assert(testList != null);
        assertEquals(2, (long)testList.size());
        assertEquals(1, (long)testList.get(0));
        assertEquals(3, (long)testList.get(1));

        // test -3
        testList = Java101Exercises.findFactorsEfficiently071(-3);
        assert(testList != null);
        assertEquals(4, (long)testList.size());
        assertEquals(-3, (long)testList.get(0));
        assertEquals(-1, (long)testList.get(1));
        assertEquals(1, (long)testList.get(2));
        assertEquals(3, (long)testList.get(3));

        // test 9
        testList = Java101Exercises.findFactorsEfficiently071(9);
        assert(testList != null);
        assertEquals(3, (long)testList.size(), 3);
        assertEquals(1, (long)testList.get(0), 1);
        assertEquals(3, (long)testList.get(1), 3);
        assertEquals(9, (long)testList.get(2), 9);

        // test 8
        testList = Java101Exercises.findFactorsEfficiently071(8);
        assert(testList != null);
        assertEquals(4, (long)testList.size());
        assertEquals(1, (long)testList.get(0));
        assertEquals(2, (long)testList.get(1));
        assertEquals(4, (long)testList.get(2));
        assertEquals(8, (long)testList.get(3));

        // test 125
        testList = Java101Exercises.findFactorsEfficiently071(125);
        assert(testList != null);
        assertEquals(4, (long)testList.size());
        assertEquals(1, (long)testList.get(0));
        assertEquals(5, (long)testList.get(1));
        assertEquals(25, (long)testList.get(2));
        assertEquals(125, (long)testList.get(3));

        // test -125
        testList = Java101Exercises.findFactorsEfficiently071(-125);
        assert(testList != null);
        assertEquals(8, (long)testList.size());
        assertEquals(-125, (long)testList.get(0));
        assertEquals(-5, (long)testList.get(2));
        assertEquals(5, (long)testList.get(5));
        assertEquals(125, (long)testList.get(7));

        // test 2080046
        // also test time
        long startTime = System.nanoTime();
        testList = Java101Exercises.findFactorsEfficiently071(2080046);
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

    @Test
    public void convertRomanNumeral072Test() {
        assertEquals("Java101Exercises.convertRomanNumeral072(\"I\") Failed", 1, Java101Exercises.convertRomanNumeral072("I"));
        assertEquals("Java101Exercises.convertRomanNumeral072(\"MCMXXLIV\") Failed", 1976, Java101Exercises.convertRomanNumeral072("MCMLXXVI"));
        assertEquals("Java101Exercises.convertRomanNumeral072(\"MDCCXII\") Failed", 1492, Java101Exercises.convertRomanNumeral072("MCDXCII"));
        assertEquals("Java101Exercises.convertRomanNumeral072(\"CC\") Failed", 200, Java101Exercises.convertRomanNumeral072("CC"));
        assertEquals("Java101Exercises.convertRomanNumeral072(\"MCCCDXXXIV\") Failed", 1836, Java101Exercises.convertRomanNumeral072("MDCCCXXXVI"));
        assertEquals("Java101Exercises.convertRomanNumeral072(\"MMCCXXII\") Failed", 2222, Java101Exercises.convertRomanNumeral072("MMCCXXII"));
        assertEquals("Java101Exercises.convertRomanNumeral072(\"MMI\") Failed", 2001, Java101Exercises.convertRomanNumeral072("MMI"));
        assertEquals("Java101Exercises.convertRomanNumeral072(\"MCM\") Failed", 1900, Java101Exercises.convertRomanNumeral072("MCM"));
        assertEquals("Java101Exercises.convertRomanNumeral072(\"CD\") Failed", 400, Java101Exercises.convertRomanNumeral072("CD"));
        assertEquals("Java101Exercises.convertRomanNumeral072(\"DC\") Failed", 600, Java101Exercises.convertRomanNumeral072("DC"));
        assertEquals("Java101Exercises.convertRomanNumeral072(\"CXC\") Failed", 190, Java101Exercises.convertRomanNumeral072("CXC"));
        assertEquals("Java101Exercises.convertRomanNumeral072(\"XL\") Failed", 40, Java101Exercises.convertRomanNumeral072("XL"));
        assertEquals("Java101Exercises.convertRomanNumeral072(\"LX\") Failed", 60, Java101Exercises.convertRomanNumeral072("LX"));
        assertEquals("Java101Exercises.convertRomanNumeral072(\"IX\") Failed", 9, Java101Exercises.convertRomanNumeral072("IX"));
        assertEquals("Java101Exercises.convertRomanNumeral072(\"XI\") Failed", 11, Java101Exercises.convertRomanNumeral072("XI"));
        assertEquals("Java101Exercises.convertRomanNumeral072(\"IV\") Failed", 4, Java101Exercises.convertRomanNumeral072("IV"));
        assertEquals("Java101Exercises.convertRomanNumeral072(\"VI\") Failed", 6, Java101Exercises.convertRomanNumeral072("VI"));
    }
}
