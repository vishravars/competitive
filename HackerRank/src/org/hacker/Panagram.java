package org.hacker;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Panagram {

	public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String s = stdin.nextLine().trim();
        stdin.close();
        
        s = s.replaceAll("\\s+","");
        s = s.toLowerCase();
        
        Set set = new HashSet<String>();
        for(int i=0; i< s.length(); i++) {
        	
        	set.add(s.charAt(i));
        }
        
        if(set.size() == 26)
        	System.out.println("pangram");
        else
        	System.out.println("not pangram");
	}
}
