package cs230_hw5;

public class PalindroneChecker {

	/**
	 * @param args
	 */
	public static boolean isPalindrone(String s){
		MyStack stack = new MyStack();
		char [] c = s.toCharArray();
		int i = 0;
		for (i = 0; i < c.length/2; i++) {
			stack.push(c[i]);
		}
		for (i = (c.length-1)/2+1; i < c.length; i++) {
			if (stack.pop() != c[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("tot is a palindone: " + isPalindrone("tot"));
		System.out.println("ahaha is a palindone: " + isPalindrone("ahaha"));
		System.out.println("toto is not a palindone: " + isPalindrone("toto"));
		System.out.println("tottp is not a palindone: " + isPalindrone("rottr"));
		System.out.println("tkikkikt is a palindone: " + isPalindrone("tkikkikt"));
	}

}
