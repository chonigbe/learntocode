
public class test {
	public static int foobar(int[] arr, int x, int a, int b){
		  int mid = (a + b) / 2;

		  if(arr[mid] > x) {
		    return foobar(arr, x, a, mid-1);
		  } else if(arr[mid] < x) {
		    return foobar(arr, x, mid+1, b);
		  } else {
		    return mid;
		  }
		}
	
	public static void main(String[] args) {
		
	}
}
