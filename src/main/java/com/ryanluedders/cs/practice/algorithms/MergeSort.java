package com.ryanluedders.cs.practice.algorithms;

public class MergeSort {
	
	public static <T extends Comparable<T>> void sort(T[] input, int left, int right) {
		if (left == right) {
			return;
		}
		
		int mid = left + ((right - left) / 2);
		
		System.out.println(String.format("left=%d, mid=%d, right=%d", left, mid, right));
	
		sort(input, left, mid);
		sort(input, mid + 1, right);
		
		merge(input, left, mid, right);		
	}
	
	public static <T extends Comparable<T>> void merge(T[] input, int left, int mid, int right) {
		int leftIdx = left;
		int rightIdx = mid + 1;
		int resultIdx = 0;
		
		int size = right - left + 1;
		
		@SuppressWarnings("unchecked")
		T[] tempArray = (T[]) new Comparable[size];
		
		while (leftIdx <= mid || rightIdx <= right) {
			if (leftIdx > mid) {
				// if we've looked at all items on the left, use items from the right
				tempArray[resultIdx] = input[rightIdx];
				rightIdx++;
			} else if (rightIdx > right) {
				// if we've looked at all items on the right, use items from the left
				tempArray[resultIdx] = input[leftIdx];
				leftIdx++;
			} else if (input[leftIdx] == null) {
				tempArray[resultIdx] = input[leftIdx];
				leftIdx++;
			} else if (input[rightIdx] == null) {
				tempArray[resultIdx] = input[rightIdx];
				rightIdx++;
			} else if (input[leftIdx].compareTo(input[rightIdx]) < 0) {
				tempArray[resultIdx] = input[leftIdx];
				leftIdx++;
			} else {
				tempArray[resultIdx] = input[rightIdx];
				rightIdx++;
			}
			resultIdx++;
		}
		
		copyArray(tempArray, input, left);
	}
	
	private static <T extends Comparable<T>> void copyArray(T[] from, T[] to, int startIdx) {
		for (int i = 0; i < from.length; i++) {
			to[startIdx + i] = from[i];
		}
	}

}
