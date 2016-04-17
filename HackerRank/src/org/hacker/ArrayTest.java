package org.hacker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayTest {
	
	public static void main(String[] args) {
		List<String> listOfInput = new ArrayList<String>();
		List<String> listOfActuals = null;
		String line;
        Scanner stdin = new Scanner(System.in);
        int total = 0;

		while(stdin.hasNextLine() && !( line = stdin.nextLine() ).equals( "" ))
	    {
			listOfInput.add(line);
	    }
		
		total = Integer.parseInt(listOfInput.get(0));
		
		listOfActuals = listOfInput.subList(1, listOfInput.size());
		
		for(int i=0; i<listOfActuals.size(); i++){
			
			String keys = listOfActuals.get(i);
			String values = listOfActuals.get(i+1);
			int m = 0;
			String keysArr[] = keys.split(" ");
			String valuesArr[] = values.split(" ");
			
			m = Integer.parseInt(keysArr[1]);
                                
			boolean done = false;
			boolean won = false;
			int j = 0;
			while(!done) {
				if(j == valuesArr.length-1) {
					won = true;
					done = true;
				}
				else if(valuesArr[j+1].equals("0")) {
					j++;
				}
				else if(j+m > valuesArr.length-1) {
					won = true;
					done = true;
				}
				else if(valuesArr[j+m].equals("0")){
					j = j+m;
				}
				else if(((j-1) + m) != j && valuesArr[(j-1) + m].equals("0")) {
					j = (j-1)+m;
				}
				
				else {
					won = false;
					done = true;
				}
				
			}
			System.out.println(won?"YES":"NO");
			i++;
		}
		
		
		
	}
//
//	3
//	6 2
//	0 1 0 1 0 1
//	10 6
//	0 0 1 1 0 0 1 1 0 0
//	10 3
//	0 0 1 1 0 0 1 1 0 0
	
}
