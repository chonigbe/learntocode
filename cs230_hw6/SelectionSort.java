package cs230_hw6;

public class SelectionSort {
	
	public static void selectionSort(int[] arr) {
		int len = arr.length;
		int sorted = 0;
		while (sorted < len) {
			int curr = arr[sorted];
			for (int i = 0; i < len; i++ ) {
				if (arr[i] > curr) {
					int tmp = arr[i];
					arr[i] = curr;
					curr = tmp;
				}
			}
			arr[sorted] = curr;
			sorted++;
		}
	}

	
	public static void main(String[] args) {
		int[] arr = {3,0,1,8,7,2,5,4,9,6};
		selectionSort(arr);
	}
}
