package org.hacker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class PoisonousPlant {

	public static void main(String[] args) {
		ArrayList finalLst = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
	    int N = in.nextInt();
	        
	    if(N == 1) {
	    	System.out.println(in.nextInt());
	    	return;
	    }
	    	    
	    Stack stackOne  = new Stack<Integer>();
	    Stack stackTwo  = new Stack<Integer>();
	    List ll = new LinkedList<Integer>();
	    int prevValue = 0;
	    for(int i=0; i< N; i++) {
	    	stackOne.push(in.nextInt());
	    }
	    
	    while(!stackOne.isEmpty()) {
	    	
	    	Integer popped = (Integer)stackOne.pop();
	    	int value = popped;
	    	Stack newStack = new Stack<Integer>();
	    	boolean skip = false;
	    	while(!stackTwo.isEmpty()) {
	    		Integer poppedTwo = (Integer)stackTwo.pop();
	    		newStack.push(poppedTwo);
	    		if(popped <= poppedTwo && !skip) {
	    			value += popped;
	    		} else {
	    			skip = true;
	    		}
	    	}
	    	finalLst.add(value);
	    	newStack.push(popped);
	    	
	    	stackTwo = newStack;
	    }
	    
	    
	    Collections.sort(finalLst);
	    System.out.println(finalLst.get(finalLst.size()-1));
	}
	  
}
