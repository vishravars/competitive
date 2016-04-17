package org.hacker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class TwoStrings {
	
	public static void main(String[] args) {
    	List<String> listOfInput = new ArrayList<String>();   	
    	String line;
        Scanner stdin = new Scanner(System.in);
        while(stdin.hasNextLine() && !( line = stdin.nextLine() ).equals( "" ))
        {
        	listOfInput.add(line.trim());
        }
        stdin.close();
        
       List<String> listOfActuals = listOfInput.subList(1, listOfInput.size());
        
       boolean yes = false;
       for(int i = 0; i < listOfActuals.size(); i=i+2) {
    	  String one = listOfActuals.get(i);
    	  String two = listOfActuals.get(i+1);
    	  java.util.Set set = new HashSet();
    	  String higher = (one.length() > two.length() ? one : two);
    	  String lower = "";
    	  
    	  if(higher.equals(one)) {
    		  lower = two;
    	  } else {
    		  lower = one;
    	  }
    	  
    	  for(int j = 0; j<higher.length(); j++) {
    		  set.add(higher.charAt(j));
    	  }
    	  
    	  if(one.equalsIgnoreCase(two)) {
    		  yes = true;
			  break;
    	  }
    	  else {
    		  for(int k=0; k<lower.length(); k++) {
    			  if(set.contains(lower.charAt(k))) {
    				  yes = true;
    				  break;
    			  }
    		  }
    	  }
    	  
    	  if(yes)
    		  System.out.println("YES");
    	  else
    		  System.out.println("NO");
    	  break;
       }
	}

}
