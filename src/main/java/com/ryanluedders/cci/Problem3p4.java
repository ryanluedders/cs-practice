package com.ryanluedders.cci;

import java.util.Stack;

public class Problem3p4 {
    
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();
    private Stack<Integer> s3 = new Stack<>();
    
    private long stepCount = 0;
    
    public Problem3p4(int n) {
        for (int i = n; i > 0; i--) {
            s1.push(i);
        }
        
        System.out.println(toString());
    }
    
    public void solve() {
        move(s1.size(), s1, s3, s2);
    }
    
    public void move(int size, Stack<Integer> source, Stack<Integer> target, Stack<Integer> aux) {
        if (size <= 0) {
            return;
        }
        
        move(size-1, source, aux, target);      // get n-1 out of the way by moving to spare
        target.push(source.pop());            // move the last on "from" onto the "to" stack
        
        stepCount += 1;
        System.out.println(toString());
        
        move(size-1, aux, target, source);      // move the remaining disks onto target
    }
    
    public long getStepCount() {
        return stepCount;
    }

    @Override
    public String toString() {
        String result = "---------\n";
        result += s1.toString() + "\n";
        result += s2.toString() + "\n";
        result += s3.toString() + "\n";
        result += "---------";
        return result;
    }
}
