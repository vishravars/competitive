package org.hacker;

import java.util.Scanner;

public class StudentsArriving {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int L = in.nextInt();
	    
	    
	    for(int i=0; i<L; i++){
	    	int N = in.nextInt();
	    	int K = in.nextInt();
	    	
	    	int arr[] = new int[N];
	    	for(int j=0; j<N; j++) {
	    		arr[j] = in.nextInt();
	    	}
	    	
	    	long guys = 0;
	    	for(int hours: arr) {
	    		if(hours<=0) {
	    			guys++;
	    		}		
	    	}
	    	
	    	if(guys<K) 
	    		System.out.println("YES");
	    	else
	    		System.out.println("NO");
	    }
	}
}
