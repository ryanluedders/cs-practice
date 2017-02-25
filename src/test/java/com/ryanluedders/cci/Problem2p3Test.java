package com.ryanluedders.cci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ryanluedders.cci.Problem2p3.SingleLinkedList;
import com.ryanluedders.cci.Problem2p3.SingleLinkedList.SingleLinkedListNode;

public class Problem2p3Test {
    
    @Test
    public void testDeleteNode() {
        SingleLinkedList<Integer> list = new SingleLinkedList<>();
        
        list.add(10);
        SingleLinkedListNode<Integer> b = list.add(20);
        list.add(30);
        list.add(40);
        
        assertEquals("[10 20 30 40]", list.toString());
        
        list.deleteNode(b);
        
        assertEquals("[10 30 40]", list.toString());
    }
    
    @Test
    public void testDeleteNode_list_of_one() {
        SingleLinkedList<Integer> list = new SingleLinkedList<>();
        
        SingleLinkedListNode<Integer> a = list.add(10);
        
        assertEquals("[10]", list.toString());
        
        list.deleteNode(a);
        
        assertEquals("[]", list.toString());
    }

}
