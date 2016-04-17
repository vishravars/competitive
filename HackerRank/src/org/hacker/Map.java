package org.hacker;

import java.util.*;

public class Map {

	
	public static void main(String[] args) {
		List<String> listOfInput = new ArrayList<String>();
		String line;
        Scanner stdin = new Scanner(System.in);
        int total = 0;
        HashMap<String, String> dict = new HashMap<String, String>();
        String previousKey = "";
        
		while(stdin.hasNextLine() && !( line = stdin.nextLine() ).equals( "" ))
	    {
			listOfInput.add(line);
	    }
		stdin.close();

		total = Integer.parseInt(listOfInput.get(0));
		
		if(total > 100000)
			return;
		
		for(int i=1; i<= (total*2); i++) {
		
			if(!Map.isEven(i)) {
				dict.put((String)listOfInput.get(i), null);
				previousKey = (String)listOfInput.get(i);
			}
			else {
				String phno = (String)listOfInput.get(i);
				if(phno == null || phno.length() > 8 || phno.indexOf("0") == 0) {
					return;
				}
				dict.put(previousKey,phno);
			}
		}
			
		// Print the lookups
		List<String> searchList = listOfInput.subList(listOfInput.size()-total, listOfInput.size());
		if(searchList.size() > 100000)
			return;
					
		for(String srchTerms: searchList) {
			String value = (String)dict.get(srchTerms);
			if(value == null)
				System.out.println("Not found");
			else
				System.out.println(srchTerms+"=" + value);
		}
	}
	
	static boolean isEven(int number) {
		if(number % 2 == 0) 
			return true;
		else
			return false;
	}
}
