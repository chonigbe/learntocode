package cs230_hw5;

public class MyNode {
	
	char cargo;
	MyNode next;
	
	public MyNode() {
		cargo = '0';
		next = null;
	}
	
	public MyNode (char cargo, MyNode next) {
		this.cargo = cargo;
		this.next = next;
	}
	
	public String toString() {
		return "<" + cargo + ">";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
