package org.hacker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CutSticks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int N = in.nextInt();
	    
	    List<Integer> lst = new ArrayList<Integer>();
	    for(int i=0; i<N; i++){
	    	lst.add(in.nextInt());
	    }
	    
	    boolean done = false;
	    while(!done) {
	    	List<Integer> lstCurrent = new ArrayList<Integer>();
	    	Collections.sort(lst);
	    	int count = 0;
		    for(int value: lst) {
		    	//get the lowest
		    	
		    	int lowest = lst.get(0);
		    	int newOne = value-lowest;
		    	if(newOne >=0)
		    		count++;
	    		
		    	if(newOne > 0)
		    		lstCurrent.add(newOne);
		    }
		    
		    if(count == 0)
		    	done = true;
		    else
		    	System.out.println(count);
		    lst = lstCurrent;
	    }
	}
}
