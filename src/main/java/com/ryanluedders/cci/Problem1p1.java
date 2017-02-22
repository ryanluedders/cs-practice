package com.ryanluedders.cci;

public class Problem1p1 {
    
    public boolean hasAllUniqueCharacters(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("undefined behavior for null or empty string");
        }
        
        for (int i = 0; i < input.length(); i++) {
            Character c = input.charAt(i);
            if (input.indexOf(c, i + 1) != -1) {
                return false;
            }
        }
        return true;
    }

}
