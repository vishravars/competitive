package org.hacker;


import java.math.BigInteger;
import java.util.Scanner;

public class Cavity {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int T = in.nextInt();
	    
	    for(int i=0; i<T; i++){
	    	
	    	String temp = in.next();
	    	int ar[] = Cavity.toIntArray(temp);
	    		    	
	    	for(int k=0; k<ar.length; k++) {
	    		if(k == 0 || k == ar.length-1) {
	    			System.out.print(ar[k]);
	    		}
	    		else if(k == ar.length-1) {
	    			System.out.print(ar[k]);
	    		}
	    		else {
	    			if(ar[k] > ar[k-1] && ar[k] > ar[k+1])
	    				System.out.print("X");
	    			else
	    				System.out.print(ar[k]);
	    		}
	    			    			
	    	}
	    	System.out.println("");
	    }
	}
	
	public static int[] toIntArray(String input) {
	    int[] result = new int[input.length()];
	    String array[] = input.split("(?<=.)");
	    for (int i = 0; i < array.length; i++) {
	        result[i] = Integer.parseInt(array[i]);
	    }
	    return result;
	}
}
