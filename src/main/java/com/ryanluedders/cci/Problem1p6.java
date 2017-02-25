package com.ryanluedders.cci;

public class Problem1p6 {
    
    public static void rotateNinetyDegrees(int[][] array) {
        int lastIndex = array.length - 1;
        int midIndex = (int) Math.ceil(array.length / 2.0);
        for (int row = 0; row < midIndex; row++) {
            for (int col = row; col < lastIndex - row; col++) {
                int temp = array[row][col];
                array[row][col] = array[lastIndex - col][row];
                array[lastIndex - col][row] = array[lastIndex - row][lastIndex - col];
                array[lastIndex - row][lastIndex - col] = array[col][lastIndex - row];
                array[col][lastIndex - row] = temp;
            }
        }
    }
    
}
