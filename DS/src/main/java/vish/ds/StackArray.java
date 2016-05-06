package vish.ds;

import java.util.Arrays;

public class StackArray {

	private String arr [];
	
	private int sizeOfStack;
	
	private int topOfStack = -1;
	
	public StackArray(int size) {
		sizeOfStack = size;
		
		arr = new String[size];
		
		// fill it with some default value to indicate non availibility of data
		Arrays.fill(arr, "-1");
		
	}
	
	public void push(String insert) {
		
		if(topOfStack + 1 < sizeOfStack) {
			arr [++topOfStack] = insert;
		} else {
			System.out.println("Sorry the stack is full and cannot insert element " + insert);
		}

	}

	public void displayAllElements() {
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i] != "-1")
				System.out.print(arr[i] + " | ");
		}
		System.out.println();
	}
	
	public String pop() {
		
		if(topOfStack >= 0) {
			arr[topOfStack] = "-1";
			return arr[topOfStack--];
			
		} else {
			return "-1";
		}
		
	}
	
	public String peek() {
		return arr[topOfStack];
	}
	
	public static void main(String[] args) {
		StackArray sa = new StackArray(10);
		sa.push("1");
		sa.push("2");
		sa.push("3");
		sa.displayAllElements();
		System.out.println("Popped "+sa.pop());
		sa.displayAllElements();
		System.out.println(sa.peek());
		
	}
}
