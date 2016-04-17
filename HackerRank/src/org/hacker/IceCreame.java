package org.hacker;

import java.util.Scanner;

public class IceCreame {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    int noOfInputs = in.nextInt();
    
    for(int i=0;i<noOfInputs;i++){
       int M = in.nextInt();
       int N = in.nextInt();
       int[] ar = new int[N];
       
       
       for(int j=0; j<N; j++) {
           ar[j]=in.nextInt();
       }
       
       String indexes = "";
       boolean skip = false;
       for(int outer=0; (!skip && outer< ar.length); outer++) {
    	   if(ar[outer] == M) {
    		   continue;
    	   }
    	   else if(ar[outer] > M) {
    		   continue;
    	   }
    	   
    	   else {
	    	   for(int inner=0; (inner<ar.length); inner++) {
	    		   if(outer != inner && ar[outer] + ar[inner] == M) {
	    			   indexes += (outer+1) + " " + (inner+1);
	    			   skip = true;
	    			   break;
	    		   }
	    	   }
    	   }
       }
       
       System.out.println(indexes);
       
    }
}
}

