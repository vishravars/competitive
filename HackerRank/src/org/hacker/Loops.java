package org.hacker;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Loops {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	List<String> listOfInput = new ArrayList<String>();   	
    	String line;
        Scanner stdin = new Scanner(System.in);
        while(stdin.hasNextLine() && !( line = stdin.nextLine() ).equals( "" ))
        {
        	listOfInput.add(line.trim());
        }
        stdin.close();
    	
        int loopCnt = 0;
        
        StringBuffer sb = new StringBuffer();
        for(String str: listOfInput) {
    		if(loopCnt > 0) 
    		{
	    		//System.out.println("processing input:"+ str);
	    		String [] sarr = str.split(" ");
	    		int a=0, b=0, n=0;
	    		
	    		a= Integer.parseInt(sarr[0]);
	    		b= Integer.parseInt(sarr[1]);
	    		n= Integer.parseInt(sarr[2]);
	    		   		
	    		String toPrint = "";
	    		for(int j=0; j< n; j++) {
	    			int d = 0;
	    			d+=a;
	    			for(int k=0; k<=j; k++) {		
	    				d += (int) ( (((Math.pow(2, k)))*b));
	    			}

	    			if(j+1 == n)
	    				toPrint+=d+"\n";
	    			else
	    				toPrint+=d+" ";
	    		}
	    		sb.append(toPrint);
	    		
    		}
    		loopCnt++;
    	}
        
        System.out.println(sb);
    }
}