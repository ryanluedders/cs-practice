package com.ryanluedders.cs.practice.algorithms;

import java.util.ArrayList;
import java.util.List;

public class MergeSort<T> {
	
	public static <T extends Comparable<T>> T[] mergeSort(T[] input) {
		return null;
	}
	
	public static <T extends Comparable<T>> List<T> sort(List<T> input) {
		if (input.size() <= 1) {
			return input;
		}
		
		int mid = (input.size() / 2);
		int end = (input.size());
	
		List<T> l = sort(input.subList(0, mid));
		List<T> r = sort(input.subList(mid, end));
		
		return merge(l, r);
		
	}
	
	public static <T extends Comparable<T>> List<T> merge(List<T> i1, List<T> i2) {
		int idx1 = 0;
		int idx2 = 0;
		
		List<T> result = new ArrayList<>();
		
		while (idx1 != i1.size() || idx2 != i2.size()) {
			if (idx1 == i1.size()) {
				result.add(i2.get(idx2));
				idx2 += 1;
			} else if (idx2 == i2.size()) {
				result.add(i1.get(idx1));
				idx1 += 1;
			} else if (i1.get(idx1).compareTo(i2.get(idx2)) < 0) {
				result.add(i1.get(idx1));
				idx1 += 1;
			} else {
				result.add(i2.get(idx2));
				idx2 += 1;
			}
		}
		
		return result;
	}

}
