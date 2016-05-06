package vish.ds;

import java.util.Arrays;

public class TheQueue {

	private String[] queueArray = null;
	
	private int queueSize, totalElements, front, rear = 0;
	
	public TheQueue(int size) {
		queueSize = size;
		
		queueArray = new String[size];
		
		Arrays.fill(queueArray,"-1");
	}
	
	public void displayAllElements() {
		for(int i=0; i < queueArray.length; i++) {
			if(queueArray[i] != "-1")
				System.out.print(queueArray[i] + " | ");
		}
		System.out.println();
	}
	
	
	public void insert(String value) {
		if(totalElements + 1 <= queueSize) {
			queueArray[rear] = value;
			rear++;
			totalElements++;
		} else {
			System.out.println("The queue is full so cannot insert "+value);
		}
	}
	
	public void remove() {
		if(totalElements > 0) {
			queueArray[front] = "-1";
			front++;
			totalElements--;
		} else {
			System.out.println("The queue is empty and hence cannot remove");
		}
	}
	
	public static void main(String[] args) {
		TheQueue q = new TheQueue(10);
		q.insert("1");
		q.insert("2");
		q.insert("3");
		q.displayAllElements();
		q.remove();
		q.displayAllElements();
	}
	
}
