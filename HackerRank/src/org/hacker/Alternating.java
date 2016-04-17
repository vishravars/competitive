package org.hacker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Alternating {

	public static void main(String[] args) {
    	List<String> listOfInput = new ArrayList<String>();   	
    	String line;
        Scanner stdin = new Scanner(System.in);
        while(stdin.hasNextLine() && !( line = stdin.nextLine() ).equals( "" ))
        {
        	listOfInput.add(line.trim());
        }
        stdin.close();
        
        List<String> listActual = listOfInput.subList(1, listOfInput.size());
        
        for(String s: listActual) {
        	Stack stk = new Stack();
        	int noOfDelete = 0;
        	for(int i=0; i< s.length(); i++) {
        		char c = s.charAt(i);
        		
        		if(stk.isEmpty()) {
        			stk.add(c);
        		} else if(stk.peek().equals(c)) {
        			//stk.pop();
        			noOfDelete++;	
        		} else {
        			stk.add(c);
        		}
        	}
        	stk.removeAllElements();
        	System.out.println(noOfDelete);
        }
	}
}
