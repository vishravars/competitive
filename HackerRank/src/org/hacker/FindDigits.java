package org.hacker;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int N = in.nextInt();
	    
	    for(int i=0; i<N; i++){
	    	String input = in.next();
	    	int [] arr = FindDigits.toIntArray(input);
	    	int intValue = Integer.parseInt(input);
	    	int count = 0;
	    	
	    	for(int value : arr) {
	    		if(value > 0 &&  intValue%value == 0)
	    			count++;
	    	}
	    	
	    	System.out.println(count);
	    	
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
