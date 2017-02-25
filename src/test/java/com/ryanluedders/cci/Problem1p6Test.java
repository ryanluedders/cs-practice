package com.ryanluedders.cci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem1p6Test {
    
    @Test
    public void testRotateNinetyDegrees_1_x_1() {
        int[][] input = {
                { 5 }
        };
        
        Problem1p6.rotateNinetyDegrees(input);
        
        assertEquals(5, input[0][0]);
    }
    
    @Test
    public void testRotateNinetyDegrees_2_x_2() {
        int[][] input = {
                { 1, 2 },
                { 3, 4 }
        };
        
        Problem1p6.rotateNinetyDegrees(input);
        
        assertEquals(3, input[0][0]);
        assertEquals(1, input[0][1]);
        
        assertEquals(4, input[1][0]);
        assertEquals(2, input[1][1]);
    }

    @Test
    public void testRotateNinetyDegrees_3_x_3() {
        int[][] input = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        
        Problem1p6.rotateNinetyDegrees(input);
        
        assertEquals(7, input[0][0]);
        assertEquals(4, input[0][1]);
        assertEquals(1, input[0][2]);
        
        assertEquals(8, input[1][0]);
        assertEquals(5, input[1][1]);
        assertEquals(2, input[1][2]);
        
        assertEquals(9, input[2][0]);
        assertEquals(6, input[2][1]);
        assertEquals(3, input[2][2]);
    }
    
    @Test
    public void testRotateNinetyDegrees_4_x_4() {
        int[][] input = {
                { 1,  2,  3,  4 },
                { 5,  6,  7,  8 },
                { 9,  10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        
        Problem1p6.rotateNinetyDegrees(input);
        
        assertEquals(13, input[0][0]);
        assertEquals(9, input[0][1]);
        assertEquals(5, input[0][2]);
        assertEquals(1, input[0][3]);
        
        assertEquals(14, input[1][0]);
        assertEquals(10, input[1][1]);
        assertEquals(6, input[1][2]);
        assertEquals(2, input[1][3]);
        
        assertEquals(15, input[2][0]);
        assertEquals(11, input[2][1]);
        assertEquals(7, input[2][2]);
        assertEquals(3, input[2][3]);
        
        assertEquals(16, input[3][0]);
        assertEquals(12, input[3][1]);
        assertEquals(8, input[3][2]);
        assertEquals(4, input[3][3]);
    }

}
