package com.ryanluedders.cci;

import java.util.Stack;

public class Problem3p2 {
    
    static class StackNode<T extends Comparable<T>> {
        public T value;
        public StackNode<T> min;
    }
    
    static class MinStack<T extends Comparable<T>> {
        private Stack<StackNode<T>> stack = new Stack<>();
        
        public void push(T t) {
            StackNode<T> n = new StackNode<T>();
            n.value = t;
            
            StackNode<T> previousMin = null;
            if (!stack.isEmpty()) {
                previousMin = stack.peek().min;
            }
            
            if (previousMin == null || t.compareTo(previousMin.value) < 0) {
                n.min = n;
            } else {
                n.min = previousMin;
            }

            stack.push(n);
        }
        
        public T pop() {
            return stack.pop().value;
        }
        
        public T min() {
            if (stack.isEmpty()) {
                return null;
            }
            return stack.peek().min.value;
        }
        
        public T peek() {
            return stack.peek().value;
        }
    }
    
}
