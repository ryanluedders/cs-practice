package com.ryanluedders.cs.practice.algorithms;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class QuickSortTest {

	@Test
	public void testPartition_odd_num() {
		Integer[] input = {5,2,3,4,1};
		
		int pivot = QuickSort.partition(input, 0, input.length - 1);
		
		assertEquals(3, pivot);
		assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(input));
	}
	
	@Test
	public void testPartition_even_num() {
		Integer[] input = {6,2,3,5,1,4};
		
		int pivot = QuickSort.partition(input, 0, input.length - 1);
		
		assertEquals(3, pivot);
		assertEquals("[1, 2, 3, 5, 6, 4]", Arrays.toString(input));
	}
	
	@Test
	public void testSort_even_num() {
		Integer[] input = {6,2,3,5,1,4};
		
		QuickSort.sort(input, 0, input.length - 1);
		
		assertEquals("[1, 2, 3, 4, 5, 6]", Arrays.toString(input));
	}
	
	@Test
	public void testSort_ten_jumbled_numbers() {
		Integer[] input = {9,3,2,5,4,6,1,0,7,8};
		
		QuickSort.sort(input, 0, input.length - 1);
		
		assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]", Arrays.toString(input));
	}
	
	@Test
	public void testSort_duplicates() {
		Integer[] input = {3, 3, 5, 5, 3, 4, 4, 5};
		
		QuickSort.sort(input, 0, input.length - 1);
		
		assertEquals("[3, 3, 3, 4, 4, 5, 5, 5]", Arrays.toString(input));
	}

}
