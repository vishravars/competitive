package org.hacker;

import java.util.Scanner;

public class LeftRightSum {

	 public static void main(String[] args) {
	       Scanner in = new Scanner(System.in);
	       int noOfInputs = in.nextInt();
	       
	       for(int i=0;i<noOfInputs;i++){
              int noOfElem = in.nextInt();
              int[] ar = new int[noOfElem];
              for(int j=0; j<noOfElem; j++) {
                  ar[j]=in.nextInt();
              }
              
              boolean match = false;
              for(int k=0; k< ar.length-1; k++) {
	            	  // Parse the left and get total
	            	  int leftSum = 0;
	            	  int rightSum = 0;
	            	  
	            	  if(k == 0) {
	            		  leftSum = 0;
	            	  }
	            	  else {
		            	  for(int leftIndex = 0; leftIndex < k; leftIndex++) {
		            		  leftSum += ar[leftIndex];
		            	  }
		            	  //System.out.println(leftSum);
             		  }
	            	  
	            	  if(k == ar.length-1) {
	            		  rightSum = 0;
	            	  } else {
	            		  for(int rightIndex = k+1; rightIndex < ar.length;  rightIndex++) {
		            		  rightSum += ar[rightIndex];
		            	  }
		            	  //System.out.println(rightSum);
	            	  }
	            	  
	            	  if(leftSum == rightSum) {
	            		  match = true;
	            		  break;
	            	  }
	            	  else {
	            		  match = false;
	            	  }
            	  }
	             System.out.println((match) ? "YES": "NO");
	       }	                    
	    }
}
