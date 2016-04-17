package org.hacker;

import java.util.Scanner;

public class InsertionSort {

	 public static void insertIntoSorted(int[] ar) {
	        // Fill up this function 
		 	// get the element to insert
	        int temp = ar[ar.length-1];
	        
	        for(int j = ar.length - 2; j >= 0; j--) {
	        	if(temp > ar[j]) {
	        		ar[j + 1] = temp;
	        		printArray(ar);
	        		break;
	        	} else {
	        		ar[j+1] = ar[j];
	        		printArray(ar);
	        	}
	        }
	          
	        if(temp <= ar[0]){
	        	ar[0] = temp;
	        	printArray(ar);
	        }
	    }
	    
	    
	/* Tail starts here */
	     public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int s = in.nextInt();
	        int[] ar = new int[s];
	         for(int i=0;i<s;i++){
	            ar[i]=in.nextInt(); 
	         }
	         insertIntoSorted(ar);
	    }
	    
	    
	    private static void printArray(int[] ar) {
	      for(int n: ar){
	         System.out.print(n+" ");
	      }
	        System.out.println("");
	   }
	    
	    
}
