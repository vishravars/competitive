package org.hacker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Balanced {

	public static void main(String[] args) {
		List<String> listOfInput = new ArrayList<String>();
		String line;
        Scanner stdin = new Scanner(System.in);
        Stack<String> stk = new Stack<String>();

		while(stdin.hasNextLine() && !( line = stdin.nextLine() ).equals( "" ))
	    {
			listOfInput.add(line);
	    }
		
		for(String s: listOfInput) {
			
			String [] sarr = s.split("");
			for(String c: sarr) {
				if(c.equals(""))
					continue;
				if(stk != null && stk.isEmpty()) {
					stk.add(c);
				} else {
					if(Balanced.isOpposite(c, stk.peek())){
						stk.pop();
						continue;
					}
					else {
						stk.add(c);
					}
				}
			}
			if(stk.isEmpty())
				System.out.println("true");
			else
				System.out.println("false");
		
			stk.removeAllElements();
		}
		
		
	}
	
	static boolean isOpposite(String value, String compare) {
		if(value.equals("{") && compare.equals("}")) {
			return true;
		}
		
		else if(value.equals("}") && compare.equals("{")) {
			return true;
		}
		
		else if(value.equals("(") && compare.equals(")")) {
			return true;
		}
		
		else if(value.equals(")") && compare.equals("(")) {
			return true;
		}
		
		else if(value.equals("[") && compare.equals("]")) {
			return true;
		}

		else if(value.equals("]") && compare.equals("[")) {
			return true;
		}

		return false;
	}
}

