package cs230_hw6;

public class Insertion_sort {
	public static void insertionSort(int[] arr) {
		int len = arr.length;
		int sorted = 0;
		while (sorted < len) {
			int tmp = arr[sorted];
			insert(arr, sorted, tmp);
			sorted++;
		}
		
	}
	
	public static void insert(int[] arr, int sorted, int tmp) {
		for (int i = sorted; i >= 0; i--) {
			if (tmp < arr[i]) {
				arr[i+1] = arr[i];
				arr[i] = tmp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {3,0,1,8,7,2,5,4,9,6};
		insertionSort(arr);
	}
}
