package org.hacker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lexico {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		String s = stdin.nextLine();
		int siz = stdin.nextInt();
		//String s = "welcometojava";
		//int siz = 3;
		
		int iterations = s.length() - siz + 1;
		List<String> l = new ArrayList<String>();
		for(int i=0; i< iterations; i++) {
			l.add(s.substring(i, i+siz));
		}
		
		Collections.sort(l);
		
		System.out.println(l.get(0));
		System.out.println(l.get(l.size()-1));
	}
	
}
