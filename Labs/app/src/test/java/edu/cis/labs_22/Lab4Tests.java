package edu.cis.labs_22;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import edu.cis.labs_22.Lab4.Recursion;

import static org.junit.Assert.*;

public class Lab4Tests {
    static Recursion test = new Recursion();
    private static double totalScore;
    private static String watchedLog;

    @Test
    public void descending()
    {
        String result = test.descending(5);
        String answer = "5...4...3...2...1";
        assertEquals(answer, result);
    }

    @Test
    public void descendingOneNumber()
    {
        String resultOne = test.descending(1);
        String answerOne = "1";
        assertEquals(answerOne, resultOne);
    }

    @Test
    public void descendingLong()
    {
        String resultLong = test.descending(11);
        String answerLong = "11...10...9...8...7...6...5...4...3...2...1";
        assertEquals(answerLong, answerLong);
    }

    @Test
    public void fact()
    {
        assertEquals(1, test.fact(1));
        assertEquals(120, test.fact(5));
        assertEquals(39916800, test.fact(11));
    }

    @Test(expected = NoSuchElementException.class)
    public void factZero()
    {
        test.fact(0);
    }

    @Test(expected = NoSuchElementException.class)
    public void factNegative()
    {
        test.fact(-1);
    }

    @Test
    public void exp()
    {
        assertEquals(8, test.exp(2, 3));
        assertEquals(1, test.exp(5, 0));
        assertEquals(9, test.exp(3, 2));
        assertEquals(-8, test.exp(-2, 3));
    }

    @Test(expected = NoSuchElementException.class)
    public void expNegativeM()
    {
        test.exp(2, -3);
    }


    @Test(expected = NoSuchElementException.class)
    public void expNegativeXM()
    {
        test.exp(-2, -3);
    }

    @Test
    public void search()
    {
        ArrayList<Integer> listOne= new ArrayList<>();
        listOne.add(8); listOne.add(9); listOne.add(10); listOne.add(1);
        assertTrue(test.search(listOne, 8));

        ArrayList<Integer> listTwo= new ArrayList<>();
        listOne.add(5); listOne.add(4); listOne.add(3); listOne.add(1);
        assertFalse(test.search(listTwo, 6));

    }

    @Test
    public void searchEmpty()
    {
        ArrayList<Integer> emptyList= new ArrayList<>();
        assertFalse(test.search(emptyList,  8));
        assertFalse(test.search(emptyList,  6));
    }

    @Test
    public void sum()
    {
        assertEquals(60, test.sum(new int[]{10,20,30}, 0));
        assertEquals(160, test.sum(new int[]{10,20,30, 100}, 0));
    }

    @Test
    public void sumEmpty()
    {
        assertEquals(0, test.sum(new int[]{}, 0));
    }

    @Test
    public void sumNegative()
    {
        assertEquals(-20, test.sum(new int[]{-10,20,-30}, 0));
        assertEquals(0, test.sum(new int[]{10,20,-30}, 0));
        assertEquals(-160, test.sum(new int[]{-10,-20,-30, -100}, 0));

    }

    @Test
    public void greatest()
    {
        assertEquals(1,test.greatest(new int[]{1}, 0));
        assertEquals(500, test.greatest(new int[]{5, 500, 1, 10}, 0));

    }

    @Test
    public void greatestNegative()
    {
        assertEquals(-1, test.greatest(new int[]{-1}, 0));
        assertEquals(-1, test.greatest(new int[]{-5, -500, -1, -10}, 0));
    }

    @Test(expected = NoSuchElementException.class)
    public void greatestEmptyArray()
    {
        test.greatest(new int[]{}, 0);
    }

    @Test
    public void isPalindrome()
    {
        assertTrue(test.isPalindrome("madam"));
        assertTrue(test.isPalindrome("step  on  no  pets"));
        assertFalse(test.isPalindrome("byebye"));
        assertFalse(test.isPalindrome("ok"));
    }

    @Test
    public void isPalindromeEmpty()
    {
        assertTrue(test.isPalindrome(""));
    }

    @Test
    public void evenDigits()
    {
        assertEquals(8426, test.evenDigits(8342116));
        assertEquals(-60, test.evenDigits(-163505));
        assertEquals(0, test.evenDigits(0));
    }

    @Test
    public void evaluate()
    {
        assertEquals(10, test.evaluate("(7+ 3 )"));
        assertEquals(240, test.evaluate("(12*(10+10))"));
        assertEquals(240, test.evaluate("((10+10)*12)"));
    }

    @Test
    public void evaluateWeirdSpaces()
    {
        assertEquals(95, test.evaluate("( (1*17) + (2* (3+ ( 4*9 ))) )" ));
    }

    @Test
    public void evaluateZeros()
    {
        assertEquals(0,test.evaluate("(0)"));
        assertEquals(10, test.evaluate("((0) + (7 + 3))"));
    }

    /*
     * SCORING Code, dont' change!
     */


    @AfterClass
    public static void end()
    {
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_RESET = "\u001B[0m";
        String ANSI_PURPLE = "\u001B[35m";
        String colorToUse = "\u001B[31m";

        if (totalScore >= 14.99) colorToUse = ANSI_GREEN;

        System.out.println(colorToUse + "----------");
        System.out.println(colorToUse + "YOUR TOTAL SCORE IS: ");
        System.out.printf(colorToUse+ "%.2f", totalScore);
        System.out.println(colorToUse+ "/15.00");

        System.out.println(colorToUse + "----------");
        System.out.println(ANSI_RESET);

    }

    @Rule
    public TestWatcher watchman= new TestWatcher() {
        @Override
        protected void failed(Throwable e, Description description) {
            watchedLog+= description + "\n";
        }

        @Override
        protected void succeeded(Description description) {
            switch (description.getMethodName())
            {
                case ("descending"):
                    totalScore += 0.3;
                    break;
                case("descendingOneNumber"):
                    totalScore += 0.15;
                    break;
                case("descendingLong"):
                    totalScore += 0.05;
                    break;
                case("fact"):
                    totalScore += 0.3;
                    break;
                case("factZero"):
                    totalScore += 0.1;
                    break;
                case("factNegative"):
                    totalScore += 0.1;
                    break;
                case ("exp"):
                    totalScore +=0.5;
                    break;
                case("expNegativeM"):
                    totalScore +=0.3;
                    break;
                case("expNegativeXM"):
                    totalScore += 0.2;
                    break;
                case("search"):
                    totalScore += 0.7;
                    break;
                case("searchEmpty"):
                    totalScore += 0.3;
                    break;
                case("sum"):
                    totalScore += 0.7;
                    break;
                case("sumEmpty"):
                    totalScore += 0.2;
                    break;
                case("sumNegative"):
                    totalScore += 0.1;
                    break;
                case("greatest"):
                    totalScore += 1;
                    break;
                case("greatestNegative"):
                    totalScore += 0.7;
                    break;
                case("greatestEmptyArray"):
                    totalScore += 0.3;
                    break;
                case("isPalindrome"):
                    totalScore += 1.5;
                    break;
                case("isPalindromeEmpty"):
                    totalScore += 0.5;
                    break;
                case("evenDigits"):
                    totalScore +=2.0;
                    break;
                case("evaluate"):
                    totalScore += 3.0;
                    break;
                case("evaluateWeirdSpaces"):
                    totalScore += 1.0;
                    break;
                case("evaluateZeros"):
                    totalScore += 1.0;
                    break;
                default:
                    break;
            }
        }
    };
}
