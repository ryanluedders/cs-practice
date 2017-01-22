package com.ryanluedders.cs.practice.algorithms;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class MergeSortTest {
	
	@Test
	public void testMergeSort_even_no() {
		Integer[] in = {4, 2, 9, 3, 1, 5, 8, 7};
		
		MergeSort.sort(in, 0, in.length - 1);
		
		assertEquals("[1, 2, 3, 4, 5, 7, 8, 9]", Arrays.toString(in));
	}
	
	@Test
	public void testMergeSort_odd_no() {
		Integer[] in = {4, 2, 9, 3, 1, 5, 8};
		
		MergeSort.sort(in, 0, in.length - 1);
		
		assertEquals("[1, 2, 3, 4, 5, 8, 9]", Arrays.toString(in));
	}
	
	@Test
	public void testMergeSort_two_items() {
		Integer[] in = {7, 3};
		
		MergeSort.sort(in, 0, in.length - 1);
		
		assertEquals("[3, 7]", Arrays.toString(in));
	}
	
	@Test
	public void testMergeSort_one_item() {
		Integer[] in = {5};
		
		MergeSort.sort(in, 0, in.length - 1);
		
		assertEquals("[5]", Arrays.toString(in));
	}
	
	@Test
	public void testMergeSort_duplicate_items() {
		Integer[] in = {4, 2, 2, 3, 1, 3, 8};
		
		MergeSort.sort(in, 0, in.length - 1);
		
		assertEquals("[1, 2, 2, 3, 3, 4, 8]", Arrays.toString(in));
	}
	
	@Test
	public void testMergeSort_empty() {
		Integer[] in = {};
		
		MergeSort.sort(in, 0, 0);
		
		assertEquals("[]", Arrays.toString(in));
	}
	
	@Test
	public void testMergeSort_null_items() {
		Integer[] in = {4, 2, null, 3, 1, null, 8};
		
		MergeSort.sort(in, 0, in.length - 1);
		
		assertEquals("[null, null, 1, 2, 3, 4, 8]", Arrays.toString(in));
	}

}
