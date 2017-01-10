package com.ryanluedders.cs.practice.queue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CircularQueueTest {
    
    @Test
    public void testCircularQueue() {
    	int size = 10;
    	CircularQueue<Integer> q = new CircularQueue<>(size);
    	
    	q.enqueue(1);
    	q.enqueue(2);
    	q.enqueue(3);
    	
    	assertEquals("[1,2,3]", q.toString());
    }
    
    @Test
    public void testCircularQueue_dequeue() {
    	int size = 10;
    	CircularQueue<Integer> q = new CircularQueue<>(size);
    	
    	q.enqueue(1);
    	q.enqueue(2);
    	q.enqueue(3);
    	
    	assertEquals("[1,2,3]", q.toString());
    	
    	assertEquals(1, q.dequeue().intValue());
    	assertEquals(2, q.dequeue().intValue());
    	assertEquals(3, q.dequeue().intValue());
    	assertEquals(null, q.dequeue());
    	
    	assertEquals("[]", q.toString());
    }
    
    @Test
    public void testCircularQueue_empty() {
    	int size = 10;
    	CircularQueue<Integer> q = new CircularQueue<>(size);
    	
    	assertEquals("[]", q.toString());
    }
    
    public void testCircularQueue_full() {
    	int size = 10;
    	CircularQueue<Integer> q = new CircularQueue<>(size);
    	
    	for (int i = 0; i < size; i++) {
    		q.enqueue(i);
    	}
    	
    	assertEquals("[0,1,2,3,4,5,6,7,8,9]", q.toString());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCircularQueue_overflow() {
    	int size = 10;
    	CircularQueue<Integer> q = new CircularQueue<>(size);
    	
    	for (int i = 0; i < size + 1; i++) {
    		q.enqueue(i);
    		System.out.println(q.toString());
    	}
    }

}
