package edu.cis.labs_22;

import org.junit.Test;
import static org.junit.Assert.*;

import edu.cis.labs_22.Lab5.CISLinkedList;

public class Lab5Tests {

    @Test
    public void isEmptyTest()
    {
        CISLinkedList<String> cll = new CISLinkedList<>();
        System.out.println(cll.toString());
        assertTrue(cll.isEmpty());
    }

    @Test
    public void addAndGetFirstTest()
    {
        CISLinkedList<String> cll = new CISLinkedList<>();
        assertTrue(cll.isEmpty());
        String firstItemIn = "string one in";
        String secondItemIn = "string two in";
        cll.addFirst(firstItemIn);
        assertEquals(firstItemIn, cll.getFirst());
        cll.addFirst(secondItemIn);

        assertFalse(cll.isEmpty());

        assertEquals(secondItemIn, cll.getFirst());
    }

    @Test
    public void addManyTest()
    {
        CISLinkedList<String> cll = new CISLinkedList<>();

        for(int i = 0; i < 100; i++)
        {
            String itemIn = "item #" + i;
            cll.addFirst(itemIn);
        }

        assertFalse(cll.isEmpty());
        assertEquals("item #" + 99, cll.getFirst());
    }

    @Test
    public void removeFirstTest()
    {
        CISLinkedList<String> cll = new CISLinkedList<>();

        for(int i = 0; i < 100; i++)
        {
            String itemIn = "item #" + i;
            cll.addFirst(itemIn);
        }

        assertFalse(cll.isEmpty());
        assertEquals("item #" + 99, cll.getFirst());
        String removed = cll.removeFirst();

        //removeFirst will have removed and RETURNED item 99
        assertEquals("item #" + 99,removed);

        //item 98 should be at the head now
        assertEquals("item #" + 98, cll.getFirst());
    }

    @Test
    public void addTest()
    {
        CISLinkedList<String> cll = new CISLinkedList<>();

        for(int i = 0; i < 100; i++)
        {
            String itemIn = "item #" + i;
            cll.add(itemIn);
        }

        assertFalse(cll.isEmpty());

        //item 0 should be at the head
        assertEquals("item #0", cll.getFirst());

        //add some numbers to the front, all duplicates
        for(int i = 0; i < 10; i++)
        {
            String itemIn = "item #" + i;
            cll.addFirst(itemIn);
            cll.add(itemIn);
        }

        //should have item #9 at the front
        assertEquals("item #9", cll.getFirst());
    }

    @Test
    public void getLastTest()
    {
        CISLinkedList<Integer> cll = new CISLinkedList<>();

        for(int i = 0; i < 10; i++)
        {
            cll.add(i);
        }

        assertFalse(cll.isEmpty());

        Integer lastNum = 9;
        assertEquals(lastNum, cll.getLast());
    }

    @Test
    public void clearTest()
    {
        CISLinkedList<String> cll = new CISLinkedList<>();

        for(int i = 0; i < 100; i++)
        {
            String itemIn = "item #" + i;
            cll.add(itemIn);
        }

        assertFalse(cll.isEmpty());

        cll.clear();

        assertTrue(cll.isEmpty());
    }

    @Test
    public void containsTest()
    {
        CISLinkedList<Integer> cll = new CISLinkedList<>();

        for(int i = 0; i < 10; i++)
        {
            cll.add(i);
        }

        assertFalse(cll.isEmpty());

        assertTrue(cll.contains(0));

        assertFalse(cll.contains(99));
    }

    @Test
    public void getTest()
    {
        CISLinkedList<Integer> cll = new CISLinkedList<>();

        for(int i = 0; i < 10; i++)
        {
            cll.add(i);
        }

        assertFalse(cll.isEmpty());

        Integer firstNum = 0;
        Integer lastNum = 9;
        assertEquals(firstNum, cll.get(0));
        assertEquals(lastNum, cll.get(9));

    }

    @Test
    public void insertAfterTest()
    {

    }

    @Test
    public void removeTest()
    {

    }

    //you may add other tests for iterators
}