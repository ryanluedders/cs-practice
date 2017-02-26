package com.ryanluedders.cci;

import org.junit.Test;

public class Problem3p4Test {
    
    @Test
    public void test_solve_4() {
        Problem3p4 p = new Problem3p4(4);
        p.solve();
        
        System.out.println(p.toString());
        System.out.println("stepCount=" + p.getStepCount());
    }
    
    @Test
    public void test_solve_10() {
        Problem3p4 p = new Problem3p4(10);
        p.solve();
        
        System.out.println(p.toString());
        System.out.println("stepCount=" + p.getStepCount());
    }

}
