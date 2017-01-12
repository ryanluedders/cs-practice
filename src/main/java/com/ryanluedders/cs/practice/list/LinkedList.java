package com.ryanluedders.cs.practice.list;

public class LinkedList<T> {
    
    private Node<T> start = null;
    
    public class Node<NT> {
        
        NT value;
        
        Node<NT> next;
        
        public NT getValue() {
            return value;
        }
        public void setValue(NT value) {
            this.value = value;
        }
        public Node<NT> getNext() {
            return next;
        }
        public void setNext(Node<NT> next) {
            this.next = next;
        }
    }
    
    public void addToEnd(T value) {
        Node<T> newNode = new Node<T>();
        newNode.setValue(value);
        newNode.setNext(null);
        
        if (start == null) {
            start = newNode;
        } else {
            Node<T> n = start;
            while (n != null && n.next != null) {
                n = n.next;
            }
            n.next = newNode;
        }
    }
    
    /**
     * O(N) time, has to iterate over entire list
     */
    public T get(int position) {
        Node<T> n = start;
        for (int i = 0; i < position; i++) {
            n = n.next;
            if (n == null) {
                throw new IllegalArgumentException("list boundary exceeded");
            }
        }
        return n.getValue();
    }
    
    public String toString() {
        String result = "[";
        Node<T> n = start;
        while (n != null) {
            if (n != start) {
                result += ",";
            }
            result += String.valueOf(n.getValue());
            n = n.next;
        }
        result += "]";
        return result;
    }
    
    public int size() {
    	Node<T> n = start;
    	int result = 0;
    	while (n != null) {
    		n = n.next;
    		result += 1;
    	}
    	return result;
    }
    
    public void replace(int idx, T t) {
    	if (idx == 0) {
    		Node<T> n = new Node<T>();
    		n.setNext(start.next);
    		n.setValue(t);
    		start = n;
    		return;
    	}
    	
    	Node<T> n = start;
    	int i = 0;
    	while (i < (idx - 1)) {
    		i += 1;
    		n = n.next;
    	}
    	
    	Node<T> replacement = new Node<T>();
    	replacement.setValue(t);
    	
    	if (n.next == null) {
    		replacement.setNext(null);
    	} else {
    		replacement.setNext(n.next.next);
    	}
    	
    	n.next = replacement;
    }

}
