package com.ryanluedders.cs.practice.queue;

public class CircularQueue<T> {
	
	T[] values;

	Integer front = null;
	
	Integer rear = null;
    
    public CircularQueue(int size) {
    	values = (T[]) new Object[size];
    }
    
	// front == null && rear == null : represents EMPTY case
	// front == rear (and not null) : represents FULL case
    
    public void enqueue(T t) {
    	// check for empty case, set up indices in preparation for add
    	if (front == null && rear == null) {
    		front = 0;
    		rear = 0;
    	} else if (front == rear) {
    		throw new IllegalArgumentException("queue overflow");
    	}
    	
    	values[rear] = t;
    	rear = (rear + 1) % values.length;
    }
    
    public T dequeue() {
    	if (front == null && rear == null) {
    		return null;
    	}
    	
    	T result = values[front];
    	front = (front + 1) % values.length;
    	
    	// on dequeue, check if front has caught back up with
    	// rear. This indicates an empty case and indices should
    	// indicate such
    	if (front == rear) {
    		front = null;
    		rear = null;
    	}
    	
    	return result;
    }
    
    public String toString() {
    	if (front == null && rear == null) {
    		return "[]";
    	}
    	
    	String result = "[";
    	int i = front;
    	do {
    		if (i != front) {
    			result += ",";
    		}
    		result += String.valueOf(values[i]);
    		i = (i + 1) % values.length;
    	} while (i != rear);
    	result += "]";
    	return result;
    }

}
