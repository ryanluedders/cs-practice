package com.ryanluedders.cs.practice.tree;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryTreeTest {
	
	@Test
	public void testBinaryTree_toString_happy_path() {
		BinaryTree<String> t = new BinaryTree<>();
		t.insert("D");
		t.insert("C");
		t.insert("E");
		t.insert("F");
		
		String result = t.toString();
		
		System.out.println(result);
		
		assertEquals("{D->({C->(null,null)},{E->(null,{F->(null,null)})})}", result);
	}
	
	@Test
	public void testBinaryTree_empty() {
		BinaryTree<String> t = new BinaryTree<>();
		
		String result = t.toString();
		
		System.out.println(result);
		
		assertEquals("null", result);
	}
	
}
