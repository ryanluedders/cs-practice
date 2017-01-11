package com.ryanluedders.cs.practice.queue;

public class CircularQueue<T> {
	
	private T[] values;

	private Integer front = 0;
	
	private Integer rear = 0;
	
	private boolean isEmpty = true;
    
    public CircularQueue(int size) {
    	values = (T[]) new Object[size];
    }
    
	// front == null && rear == null : represents EMPTY case
	// front == rear (and not null) : represents FULL case
    
    public void enqueue(T t) {
    	// check for empty case, set up indices in preparation for add
    	if (isEmpty) {
    		isEmpty = false;
    	} else if (front == rear) {
    		throw new IllegalArgumentException("queue overflow");
    	}
    	
    	values[rear] = t;
    	rear = (rear + 1) % values.length;
    }
    
    public T dequeue() {
    	if (isEmpty) {
    		return null;
    	}
    	
    	T result = values[front];
    	front = (front + 1) % values.length;
    	
    	// on dequeue, check if front has caught back up with
    	// rear. This indicates an empty case and indices should
    	// indicate such
    	if (front == rear) {
    		isEmpty = true;
    	}
    	
    	return result;
    }
    
    public String toString() {
    	if (isEmpty) {
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
