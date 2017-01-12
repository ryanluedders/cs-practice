package com.ryanluedders.cs.practice.list;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListTest {
    
    @Test
    public void testLinkedList_happy_path() {
        LinkedList<Integer> l = new LinkedList<>();
        l.addToEnd(1);
        l.addToEnd(3);
        l.addToEnd(5);
        assertEquals(3, l.size());
        assertEquals("[1,3,5]", l.toString());
    }
    
    @Test
    public void testLinkedList_single_item() {
        LinkedList<Integer> l = new LinkedList<>();
        l.addToEnd(5);
        assertEquals(1, l.size());
        assertEquals("[5]", l.toString());
    }
    
    @Test
    public void testLinkedList_empty() {
        LinkedList<Integer> l = new LinkedList<>();
        assertEquals(0, l.size());
        assertEquals("[]", l.toString());
    }
    
    @Test
    public void testLinkedList_null_value() {
        LinkedList<Integer> l = new LinkedList<>();
        l.addToEnd(1);
        l.addToEnd(null);
        l.addToEnd(5);
        assertEquals(3, l.size());
        assertEquals("[1,null,5]", l.toString());
    }
    
    @Test
    public void testLinkedList_get_valid_position() {
        LinkedList<Integer> l = new LinkedList<>();
        l.addToEnd(1);
        l.addToEnd(3);
        l.addToEnd(5);
        assertEquals(3, l.size());
        assertEquals(5, l.get(2).intValue());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testLinkedList_past_end() {
        LinkedList<Integer> l = new LinkedList<>();
        l.addToEnd(1);
        l.addToEnd(3);
        l.addToEnd(5);
        assertEquals(3, l.size());
        assertEquals(5, l.get(3).intValue());
    }

}
