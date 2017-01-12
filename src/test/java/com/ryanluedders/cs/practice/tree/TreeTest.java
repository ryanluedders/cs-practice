package com.ryanluedders.cs.practice.tree;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TreeTest {
    
    @Test
    public void testTree_happy_path() {
        Tree<String> t = new Tree<>();
        t.insert("D");
        t.insert("C");
        t.insert("E");
        t.insert("F");
        
        String result = t.toString();
        
        System.out.println(result);
        
        assertEquals("{D->({C->()},{E->()},{F->()})}", result);
    }
    
}
