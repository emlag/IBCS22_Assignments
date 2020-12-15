package edu.cis.labs_22.Lab4;

import java.util.ArrayList;

public class Recursion {

    /**
     *  Assume n is always an integer >= 1.
     *  Expected: descending(5) should return string "5...4...3...2...1"
     */

    public String descending(int n)
    {
        if (n <= 1) return "1";

        return n + "..." + descending(n - 1);
    }

    /**
     *  Expected: fact(5) returns 120
     *  Expected: fact(3) returns 6
     *  Expected: facts(6) returns 720
     */

    public int fact(int n)
    {
        return 0;
    }

    /**
     *  Expected: exp(5, 5) returns 3125
     */

    public int exp(int x, int m)
    {
        return 0;
    }

    /**
     * ArrayList<Integer> listOne= new ArrayList<>();
     * listOne.add(8); listOne.add(9); listOne.add(10); listOne.add(1);
     * Input: search(listOne, 6)
     * Expected return (boolean): false
     */

    public boolean search(ArrayList<Integer> elements, Integer elt)
    {
        return false;
    }

    /**
     *  Expected: sum(new int[]{10,20,30}, 0) returns 60
     *  If list is empty, return 0
     */

    public int sum(int[] elements, int idx)
    {
        return -1;
    }

    /**
     * If list is empty return NoSuchElementException
     */

    public int greatest(int[] elements, int index)
    {
        return 0;
    }

    /**
     *  isPalindrome("madam")→  true
     *  isPalindrome("racecar")→  true
     *  isPalindrome("step  on  no  pets")→  true
     *  isPalindrome("Java")→  false
     *  isPalindrome("byebye")→  false
     *  HINT: Remember that String is a char array.
     */
    public boolean isPalindrome(String word)
    {
        return false;
    }

    /**
     *  evenDigits(8342116)    returns    8426
     *  evenDigits(40109)  returns    400
     *  evenDigits(8)  returns    8
     *  evenDigits(-163505)  returns    -60
     *  evenDigits(35179)  returns    0
     */

    public int evenDigits(int n)
    {
        return 0;
    }

    /**
     *  Basics of Programming Languages.
     *  Programming languages use symbols such as + and * to help programmers
     *  deal with expressions. In this problem we'll build a recursive
     *  expression evaluator.
     *  Expected result: evaluate( "((1*17)+(2*(3+(4*9))))" ) returns 95.
     */

    public int evaluate (String expr)
    {
        return -1;
    }


    /*
     * For Testing purposes, don't change!
     */
    private double totalPoints;

    public void setTotalPoints(double totalPoints)
    {
        this.totalPoints = totalPoints;
    }

    public double getTotalPoints()
    {
        return totalPoints;
    }
}
