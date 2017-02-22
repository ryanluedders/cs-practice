package com.ryanluedders.cci;

public class Problem1p3 {
    
    public String removeDuplicates(String input) {
        if (input == null) {
            return null;
        }
        
        char[] chars = input.toCharArray();
        
        int len = chars.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                while (chars[i] == chars[j] && len > 1) {
                    shiftToEnd(chars, j, len);
                    len -= 1;
                }
            }
        }
        
        return charsToString(chars, len);
    }
    
    public void shiftToEnd(char[] chars, int idx, int len) {
        char temp = chars[idx];
        for (int i = idx; i < len - 1; i++) {
            chars[i] = chars[i+1];
        }
        chars[len - 1] = temp;
    }

    public String charsToString(char[] chars, int len) {
        String result = "";
        for (int i = 0; i < len; i++) {
            result += chars[i];
        }
        return result;
    }
}
