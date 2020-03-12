import java.util.ArrayList;
import java.util.List;

/**
 * This file has a set of Java exercises to use for improve your skill level in Java and preparing you for coding
 * interview questions. There are five levels of problems. As you improve you can move up levels.
 *
 * LEVELS:
 *          BASIC               Exercise 001 - 010
 *          EASY                Exercise 011 - 040
 *          INTERMEDIATE        Exercise 041 - 070
 *          DIFFICULT           Exercise 071 - 090
 *          ADVANCED            Exercise 091 - 101
 *
 */

public class Java101Exercises {

    /**
     * Exercise 001 - Add Ints
     * Write a method to add to integers (int) and return the sum.
     *
     * LEVEL: BASIC
     *
     * @param a     First number to add
     * @param b     Second number to add
     * @return      The sum
     */
    public static int addInts001(int a, int b) {
        // TODO: Write code here
        return 0;
    }

    /**
     * Exercise 002 - Find Two Addends
     * Given a primitive array of integers a number n, return whether any two numbers from the array add up to equal n.
     * For example, given [7, 15, 3, 6, 8] and n equal to 13, return true since 7 + 6 is 13.
     *
     * LEVEL: BASIC
     *
     * @param nums
     * @param n
     * @return
     */
    public static boolean findTwoAddends002(int[] nums, int n) {
        // TODO: Write code here
        return false;
    }

    /**
     * Exercise 011 - Preform Indicate Operation
     * Write a method with 3 parameters; a String and 2 doubles. The string will be an operation that the operation
     * needs to process on the two operands. Return the result if the operation. Return 0.0 if the operation is not
     * one of the four specified. The operation should be case sensitive.
     *
     * LEVEL: EASY
     *
     * @param operation     ADD, SUB, MUL, DIV
     * @param op1           First operand
     * @param op2           Second operand
     * @return              Result
     */
    public static double preformIndicatedOperation011(String operation, double op1, double op2) {
        // TODO: Write code here
        return 0;
    }

    /**
     * Exercise 012 - Find Factors
     * Find all of the factors for a given positive integer (int). The result needs to be sorted in ascending order.
     *
     * LEVEL: EASY
     *
     * @param num       The number to be factored
     * @return          An Integer ArrayList of factors of num.
     */
    public static ArrayList<Integer> findFactors012(int num) {
        // TODO: Write code here
        return  null;
    }

    /**
     * Exercise 013 - Get Nearest Integer to Real Sum
     * Given a two double parameters, return the nearest integer sum. If a number is half-way between to integers,
     * round up for positive sums and down for negative sums.
     *
     * LEVEL: EASY
     *
     * @param firstRealAddend    First real number
     * @param secondRealAddend    Second real number
     * @return      Integer sum
     */
    public static int getNearestIntegerToRealSum013(double firstRealAddend, double secondRealAddend ) {
        // TODO: Write code here
        return 0;
    }

    /**
     * Exercise 014 - Is it a number
     * Given a string s, write a method (function) that will return true if its a valid single integer or floating
     * point number or false if its not.
     *
     * LEVEL: EASY
     *
     * Valid examples, should return true:
     * isDigit("3")
     * isDigit("  3  ")
     * isDigit("-3.23")
     *
     * should return false:
     * isDigit("3-4")
     * isDigit("  3   5")
     * isDigit("3 5")
     * isDigit("zero")
     *
     * @param stringToTest
     * @return              True if number, false if not.
     */
    public static boolean isNumber014(String stringToTest) {
        return false;
    }

    /**
     * Exercise 041 - Multiply Elements of a List
     * Given an array of integers, return a new array such that each element at index i of the new array is the product
     * of all the numbers in the original array except the one at i.
     *
     * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input
     * was [3, 2, 1], the expected output would be [2, 3, 6].
     *S
     * LEVEL:   INTERMEDIATE
     *
     * @param iList         An array of integers
     * @return              An array of products of integers
     * @throws Exception    Invalid input should throw an exception
     */
    public static List<Integer> multiplyElementsOfList041(List<Integer> iList) throws Exception {
        // TODO: Write code here
        return null;
    }

    /**
     * Exercise 071 - Find Factors Efficiently
     * Find all of the factors for a given integer (int). The integer could be negative. The result needs to be sorted
     * in ascending order.
     *
     * The solution must be able to find the factors for 2080046 in less than 200000 nano-seconds. (ms/1000000).
     *
     * LEVEL: DIFFICULT
     *
     * @param num       The number to be factored
     * @return          An Integer ArrayList of factors of num.
     */
    public static ArrayList<Integer> findFactorsEfficiently071(int num) {
        // TODO: Write code here
        return  null;
    }

    /**
     * Exercise 072 - Roman numeral conversion
     * Given a roman numeral in a string, convert it to an integer (int). Do not worry about any roman digits past
     * M (1000).
     *
     * I = 1
     * V = 5
     * X = 10
     * L = 50
     * C = 100
     * D = 500
     * M = 1000
     *
     * LEVEL: DIFFICULT
     *
     * @param romanNumeral      The roman numeral to convert
     * @return                  The equivalent integer
     */
    public static int convertRomanNumeral072(String romanNumeral) {
        return 0;
    }
}
