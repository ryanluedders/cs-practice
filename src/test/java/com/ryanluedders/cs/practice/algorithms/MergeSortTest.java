package com.ryanluedders.cs.practice.algorithms;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MergeSortTest {
	
	@Test
	public void testMerge() {
		List<Integer> l = Arrays.asList(1, 4, 9);
		List<Integer> r = Arrays.asList(2, 5, 8);
		
		List<Integer> result = MergeSort.merge(l, r);
		
		System.out.println(result.toString());
	}
	
	@Test
	public void testMergeSort_even_no() {
		List<Integer> input = Arrays.asList(4, 2, 9, 3, 1, 5, 8, 7);
		
		List<Integer> result = MergeSort.sort(input);
		
		assertEquals("[1, 2, 3, 4, 5, 7, 8, 9]", result.toString());
	}
	
	@Test
	public void testMergeSort_odd_no() {
		List<Integer> input = Arrays.asList(4, 2, 9, 3, 1, 5, 8);
		
		List<Integer> result = MergeSort.sort(input);
		
		assertEquals("[1, 2, 3, 4, 5, 8, 9]", result.toString());
	}
	
	@Test
	public void testMergeSort_two_items() {
		List<Integer> input = Arrays.asList(7, 3);
		
		List<Integer> result = MergeSort.sort(input);
		
		assertEquals("[3, 7]", result.toString());
	}
	
	@Test
	public void testMergeSort_one_item() {
		List<Integer> input = Arrays.asList(5);
		
		List<Integer> result = MergeSort.sort(input);
		
		assertEquals("[5]", result.toString());
	}
	
	@Test
	public void testMergeSort_empty() {
		List<Integer> input = new ArrayList<>();
		
		List<Integer> result = MergeSort.sort(input);
		
		assertEquals("[]", result.toString());
	}

}
