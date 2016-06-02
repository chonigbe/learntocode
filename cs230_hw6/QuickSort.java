package cs230_hw6;

public class QuickSort {
	
	public static int sortPivot(int[] arr, int start, int end, int pivot) {
		int loc = start;
		for (int i = end; i > start; i--) {
			if (pivot > arr[i]) {
				int tmp = arr[i];
				arr[i] = pivot;
				arr[loc] = tmp;
				loc = i;
			}
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + ",");
			}
			System.out.println("\n");
		}
		return loc;
	}
	
	public static void quickSort(int[] arr, int start, int end) {
		int pivot = arr[start];
		int sort = sortPivot(arr, start, end, pivot);
		quickSort(arr, start, sort-1);
		quickSort(arr, sort+1, end);
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {3,0,1,8,7,2,5,4,9,6};
		quickSort(arr, 0, arr.length-1);
	}
}
