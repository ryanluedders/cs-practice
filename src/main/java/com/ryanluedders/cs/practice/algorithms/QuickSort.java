package com.ryanluedders.cs.practice.algorithms;

public class QuickSort<T> {
	
	public static void sort(Integer[] in, int l, int r) {
		int pivotIdx = partition(in, l, r);
		if (l < pivotIdx - 1) {
			sort(in, l, pivotIdx - 1);
		}
		if (r > pivotIdx) {
			sort(in, pivotIdx, r);
		}
	}
	
	public static int partition(Integer[] in, int l, int r) {
		Integer pivotValue = in[l + ((r - l) / 2)];
		
		System.out.println(String.format("l=%d, r=%d, pivot=%d",
				l, r, pivotValue));
		
		int i = l;
		int j = r;
		while (i <= j) {
			while (in[i] < pivotValue) {
				i++;
			}
			while (in[j] > pivotValue) {
				j--;
			}
			if (i <= j) {
				Integer temp = in[i];
				in[i] = in[j];
				in[j] = temp;
				
				i++;
				j--;
			}
		}
		
		return i;
	}

}
