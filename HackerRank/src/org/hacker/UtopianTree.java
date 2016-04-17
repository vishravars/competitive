package org.hacker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
    	List<String> listOfInput = new ArrayList<String>();   	
    	String line;
        Scanner stdin = new Scanner(System.in);
        int initialGrowth = 1;
        while(stdin.hasNextLine() && !( line = stdin.nextLine() ).equals( "" ))
        {
        	listOfInput.add(line.trim());
        }
        stdin.close();
        
        List<String> listOfActuals = listOfInput.subList(1, listOfInput.size());
        
        for(String cycles : listOfActuals) {
        	int growth = initialGrowth;
        	
        	int cycle = 1;
        	for(int i=0; i<Integer.parseInt(cycles); i++) {
        	
        		if(UtopianTree.isSpring(cycle)) {
        			growth *= 2;
        		} else {
        			growth += 1;
        		}
        		
        		cycle++;
        	}
        	
        	System.out.println(growth);
        }
        
	}
	
	static boolean isSpring(int j) {
    	if(j % 2 == 0 )
    		return false;
    	else
    		return true;
    }
}
