package org.hacker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int N = in.nextInt();
	    HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
	    List<Integer> lst = new ArrayList<Integer>();
	    
	    for(int i=0;i<N;i++){
	    	int key = in.nextInt();
	    	if(map1.containsKey(key)) {
	    		int value = map1.get(key);
	    		value++;
	    		map1.put(key, value);
	    	} else {
	    		map1.put(key, 0);
	    	}
	    }
	    
	    int M = in.nextInt();
	    HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
	    for(int j=0;j<M;j++){
	    	int key = in.nextInt();
	    	if(map2.containsKey(key)) {
	    		int value = map2.get(key);
	    		value++;
	    		map2.put(key, value);
	    	} else {
	    		map2.put(key, 0);
	    	}
	    }
	    
	   Set s = map1.keySet();
	   Iterator itr = s.iterator();
	   while(itr.hasNext()) {
		   int key = (int) itr.next();
		   if(map1.get(key) != map2.get(key)) {
			   lst.add(key);
		   } 
	   }
	    
	   Collections.sort(lst);
	   
	   for(int g=0; g<lst.size(); g++) {
		   lst.get(g);
	   }

	   for(int iValue: lst) {
		   System.out.print(iValue+" ");
	   }

	}
}
