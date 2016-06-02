package cs230_hw6;

import java.util.Arrays;

public class MergeSort {
	
	public static int[] merge(int[] left, int[] right) {
		int[] merged = new int[left.length+right.length];
		int leftPointer = 0;
		int rightPointer = 0;
		for (int i = 0; i < merged.length; i++) {
			if (leftPointer != left.length) {
				if (left[leftPointer] < right[rightPointer]){
					merged[i] = left[leftPointer];
					leftPointer++;
				}
			} else {
				if (rightPointer != right.length) {
					merged[i] = right[rightPointer];
					rightPointer++;
				}
			}
		}
//		System.out.print("[");
//		for (int j = 0; j < merged.length-1; j++) {
//			System.out.print(merged[j]+",");
//		}
//		System.out.print(merged[merged.length-1]+"]");
		return merged;
	}
	
	public static int[] mergeSort(int[] arr) {
		System.out.print("[");
		for (int j = 0; j < arr.length-1; j++) {
			System.out.print(arr[j]+",");
		}
		System.out.print(arr[arr.length-1]+"]");
		if (arr.length < 2) {
			return arr;
		}
		
		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, arr.length/2-1));
		int[] right = mergeSort(Arrays.copyOfRange(arr, arr.length/2, arr.length));
		return merge(left,right);
	}

	
	public static void main(String[] args) {
		int[] arr = {3,0,1,8,7,2,5,4,9,6};
		arr = mergeSort(arr);
		System.out.print("[");
		for (int i = 0; i < arr.length-1; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.print(arr[arr.length-1]+"]");
	}
}
