package edu.cis.labs_22.Lab5;

import java.util.Iterator;

public class CISLinkedList<T> implements Iterable<T>
{
    private Node<T> head;

    /**
     * Constructs an empty list
     */
    public CISLinkedList()
    {
        //TODO 1: Set the head to null, which means list is empty
    }

    /**
     * Returns true if the list is empty
     */
    public boolean isEmpty()
    {
        //TODO 2: Return whether this linked list has any nodes.
        return false;
    }

    /**
     * Inserts the specified item at the beginning of this list.
     */
    public void addFirst(T item)
    {
        //TODO 3: Set the head to a new Node containing "item" for data.
        // The new node should point to the old head.
    }

    /**
     * Returns the first element in the list.
     */
    public T getFirst()
    {
        //TODO 4 : Check if the head is null, if not, return the first node's data.

        return head.getData(); //Change this if necessary
    }

    /**
     * Removes the first element in the list.
     */
    public T removeFirst()
    {
        //TODO 5: Remove the first Node and return it.
        // make sure the new head is correct
        return head.getData(); //Change this if necessary
    }

    /**
     * Inserts a new node to the end of this list.
     */
    public void add(T item)
    {
        //TODO 6: check if list is empty, if so, add new node to head. Else, iterate through list
        // until you find the end, at which point, place the node after the last node found.
    }

    /**
     * Returns the last element in the list.
     */
    public T getLast()
    {
        //TODO 7: Find the last node and return it's data.
        return head.getData(); //Change this if necessary
    }

    /**
     * Removes all nodes from the list.
     */
    public void clear()
    {
        //TODO 8: Remove all nodes.
    }

    /**
     * Returns true if this list contains the specified item.
     */
    public boolean contains(T item)
    {
        //TODO 9: Search the nodes and see if item exists in the list.
        return false;
    }

    /**
     * Returns the data at the specified position in the list.
     */
    public T get(int pos)
    {
        //TODO 10: Return the data for the note at the specified position
        // throw new IndexOutOfBoundsException() if head is null or position is > than list size.
        return head.getData(); //Change this if necessary
    }

    /**
     * Returns a string representation
     */
    public String toString()
    {
        StringBuffer result = new StringBuffer();
        for (Object x : this)
            result.append(x + " ");

        return result.toString();
    }

    /**
     * Inserts a new node after a node containing the key.
     */
    public void insertAfter(T key, T toInsert)
    {
        //TODO 11: Insert "toInsert" after "key" is found
    }

    /**
     * Removes the first occurrence of the specified element in this list.
     */
    public void remove(T key)
    {
        //TODO 12: Find the specified "key" and remove it. throw new RuntimeException("cannot delete") if head is null
    }

    /*******************************************************
     *
     *  OPTIONAL Iterator class
     *
     ********************************************************/

    /**
     * Iterators help us use enhanced for loops with an object.
     * You may choose to not implement the next steps if you rather
     * use a normal for loop.
     */
    public Iterator<T> iterator()
    {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T>
    {
        private Node<T> nextNode;

        public LinkedListIterator()
        {
            //TODO 13: set nextNode to head
        }

        public boolean hasNext()
        {
            //TODO 14: check if the nextNode exists
            return false;
        }

        public T next()
        {
            //TODO 14: Check if there is no next, if so, throw new NoSuchElecementException();
            //otherwise, return the nextNode's data and set nextNode to be the next node available.
            return head.getData(); //Change this if necessary
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }
    }
}
