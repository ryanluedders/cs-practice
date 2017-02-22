package com.ryanluedders.cci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem1p1Test {
    
    private Problem1p1 p11 = new Problem1p1();

    @Test
    public void testHasAllUniqueCharacters_with_unique_characters() {
        assertEquals(true, p11.hasAllUniqueCharacters("ABCDEFG"));
    }
    
    @Test
    public void testHasAllUniqueCharacters_with_non_unique_characters() {
        assertEquals(false, p11.hasAllUniqueCharacters("ABCDEAFG"));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testHasAllUniqueCharacters_handles_nulls() {
        p11.hasAllUniqueCharacters(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testHasAllUniqueCharacters_handles_empty_string() {
        p11.hasAllUniqueCharacters("");
    }

}
