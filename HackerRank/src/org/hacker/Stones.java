package org.hacker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Stones {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int N = in.nextInt();
	    
	    for(int i=0; i<N; i++){
	    	int steps = in.nextInt();
	    	int A = in.nextInt();
	    	int B = in.nextInt();
	    	
	    	int value = 0;
	    	
	    	List<Integer> lst = new ArrayList<Integer>();
	    	lst.add(A);
	    	lst.add(B);
	    	

	    	
	    	int total = A + B;
	    	int counter = 0;
	    	for(int L = 0; L< Math.pow(2d, steps); L++) {
	    		for(int M=0; M< steps; M++) {
	    	    	// 1 1
	    	    	// 1 2
	    	    	// 2 1
	    	    	// 2 2
	    			if(M == 0)
	    				System.out.println(counter+A);
	    			else
	    				System.out.println(counter+B);
	    			
	    		}
	    	}
	    	
	    	Collections.sort(lst);
	    	
	    	for(int loop=1; loop<steps; loop++) 
	    	{
	    		List<Integer> ofValues = new ArrayList<Integer>();
	    		for(int v: lst) {
	    			value+=v;
	    			ofValues.add(value);
	    		}
	    		
	    	}
	    }
	}
}
