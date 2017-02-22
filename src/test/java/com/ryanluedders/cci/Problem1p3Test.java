package com.ryanluedders.cci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem1p3Test {
    
    private Problem1p3 p13 = new Problem1p3();

    @Test
    public void testRemoveDuplicates_handles_string_with_duplicates() {
        assertEquals("ABC", p13.removeDuplicates("AABBBC"));
    }
    
    @Test
    public void testRemoveDuplicates_handles_string_with_no_duplicates() {
        assertEquals("ABCDHG", p13.removeDuplicates("ABCDHG"));
    }
    
    @Test
    public void testRemoveDuplicates_handles_string_made_of_single_character() {
        assertEquals("C", p13.removeDuplicates("CCCCCCCCCCC"));
    }
    
    @Test
    public void testRemoveDuplicates_handles_null_string() {
        assertEquals(null, p13.removeDuplicates(null));
    }
    
    @Test
    public void testRemoveDuplicates_handles_empty_string() {
        assertEquals("", p13.removeDuplicates(""));
    }

}
