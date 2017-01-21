package com.ryanluedders.cs.practice.algorithms;

public class QuickSort<T> {
	
	public static <T extends Comparable<T>> void sort(T[] in, int l, int r) {
		if (r <= l) {
			return;
		}
		
		int pivotIdx = partition(in, l, r);
		if (l < pivotIdx - 1) {
			sort(in, l, pivotIdx - 1);
		}
		if (r > pivotIdx) {
			sort(in, pivotIdx, r);
		}
	}
	
	public static <T extends Comparable<T>>int partition(T[] in, int l, int r) {
		T pivotValue = in[l + ((r - l) / 2)];
		
		System.out.println(String.format("l=%d, r=%d, pivot=%s",
				l, r, pivotValue.toString()));
		
		int i = l;
		int j = r;
		while (i <= j) {
			while (in[i].compareTo(pivotValue) < 0) {
				i++;
			}
			while (in[j].compareTo(pivotValue) > 0) {
				j--;
			}
			if (i <= j) {
				T temp = in[i];
				in[i] = in[j];
				in[j] = temp;
				
				i++;
				j--;
			}
		}
		
		return i;
	}

}
