package org.hacker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunnyString {

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
        
        for(String s : listOfActuals) {
        	String original = s;
        	String reverse = FunnyString.reverse(original);
        	
        	boolean funny = true;
        	for(int i=0; i<original.length()-2; i++) {
        		int ascii1 = (int) original.charAt(i);
        		int ascii2 = (int) original.charAt(i+1);
        		
        		int ascii3 = (int) reverse.charAt(i);
        		int ascii4 = (int) reverse.charAt(i+1);
        		
        		int value1 = ascii2 > ascii1 ? ascii2 - ascii1 : ascii1 - ascii2;
        		int value2 = ascii4 > ascii3 ? ascii4 - ascii3 : ascii3 - ascii4;
        		
        		if(value1 != value2) {
        			funny = false;
        		}
        		//System.out.println(ascii2 - ascii1);
        		//System.out.println(ascii4 - ascii3);
        		
        	}
        	
        	if(funny)
        		System.out.println("Funny");
        	else
        		System.out.println("Not Funny");	
        	
        	//System.out.println(original);
        	//System.out.println(reverse);
        }
	}
	
	static String reverse(String orig) {
		String reversed = "";  
		for(int i=orig.length()-1; i>=0; i--)
			reversed += orig.charAt(i);
		
		return reversed;
	}
}
