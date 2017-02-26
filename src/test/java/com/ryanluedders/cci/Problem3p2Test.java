package com.ryanluedders.cci;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.ryanluedders.cci.Problem3p2.MinStack;

public class Problem3p2Test {
    
    @Test
    public void test() {
        MinStack<Integer> s = new MinStack<>();
        
        s.push(9);
        s.push(8);
        s.push(3);
        s.push(4);
        s.push(5);
        
        assertEquals(3, s.min().intValue());
        assertEquals(5, s.pop().intValue());
        
        assertEquals(3, s.min().intValue());
        assertEquals(4, s.pop().intValue());
        
        assertEquals(3, s.min().intValue());
        assertEquals(3, s.pop().intValue());
        
        assertEquals(8, s.min().intValue());
        assertEquals(8, s.pop().intValue());
        
        assertEquals(9, s.min().intValue());
        assertEquals(9, s.pop().intValue());
    }
    
    @Test
    public void test_min_on_empty_stack() {
        MinStack<Integer> s = new MinStack<>();
        
        assertNull(s.min());
    }

}
