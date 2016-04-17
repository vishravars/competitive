package org.hacker;

import java.util.Scanner;

public class InsertionSort2 {

	 public static void insertionSortPart2(int[] ar)
	    {       
	           // Fill up the code for the required logic here
	           // Manipulate the array as required
	           // The code for Input/Output is already provided
		 
		 	for(int i = 0; i< ar.length - 2; i++) {
		 		for(int j = i+1; j< ar.length-1; j++) {
			 		if(ar[i] > ar[j]) {
			 			int temp = ar[i];
			 			ar[i] = ar[j];
			 			ar[i] = temp;
			 		}
		 		}
		 		printArray(ar);
		 	}
		 	
	    }  
	    
	    
	      
	    public static void main(String[] args) {
	       Scanner in = new Scanner(System.in);
	       int s = in.nextInt();
	       int[] ar = new int[s];
	       for(int i=0;i<s;i++){
	            ar[i]=in.nextInt(); 
	       }
	       insertionSortPart2(ar);    
	                    
	    }    
	    private static void printArray(int[] ar) {
	      for(int n: ar){
	         System.out.print(n+" ");
	      }
	        System.out.println("");
	   }
	    
}
