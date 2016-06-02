package cs230_hw5;

public class MyStack {
	
	private MyNode head;
	
	public MyStack() {
		head = new MyNode();
	}
	
	public boolean empty() {
		if (head.next == null && head.next == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public char peek() {
		if (!empty()) {
			return head.cargo;
		}
		return '0';
	}
	
	public char pop() {
		if (!empty()) {
			char tmp = head.cargo;
			head = head.next;
			return tmp;
		}
		return '0';
	}
	
	public void push(char c) {
		head = new MyNode(c, head);
	}
	
	public int search(char c) {
		int count = 0;
		MyNode curr = head;
		while(curr.cargo != c || curr.cargo != 0) {
			count++; 
		}
		return count;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
