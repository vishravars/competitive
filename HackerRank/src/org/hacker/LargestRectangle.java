package org.hacker;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class LargestRectangle {
	
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		Stack<Long> stack = new Stack<Long>();
		int N = stdin.nextInt();
		
		for(int i=0; i<N; i++) {
			stack.push(stdin.nextLong());		
		}
		
		long accuValue = 0;
		long newAccu = 0;
		long prevValue = 0;
		for(int j=0; j<N;j++) 
		{
			long value = stack.pop();
			
			newAccu = value * (j+1);
			
			if(newAccu > accuValue) {
				accuValue = newAccu;
				
			}
			
			prevValue = value;	
		}
		
		System.out.println(accuValue);
	}

}
