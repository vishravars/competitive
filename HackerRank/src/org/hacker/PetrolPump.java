package org.hacker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class PetrolPump {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Pump> q = new LinkedList<Pump>();
        List<Pump> lst = new ArrayList<Pump>();
        int totalDist = 0;
        
        for(int i=0; i< N ; i++) {
        	Pump p = new Pump(sc.nextInt(), sc.nextInt(), i);
        	lst.add(p);
        	totalDist += p.dist;
        }
        
        int j = 0;
        while(true) {
        	
        	int index = PetrolPump.find(lst, totalDist, j);
        	if(index != -1) {
        		System.out.println(index);
        		break;
        	} else {
        		Collections.rotate(lst, lst.size() -1);
        	}
        	j++;
        }
        
 }
    
 public static int find(List<Pump> pumps, int totalDist, int startIndex) {
     int accDist = 0;
     for(int i = 0; i< pumps.size(); i++) {		
    	 Pump currPump = pumps.get(i);
    	 
    	 if((accDist + currPump.petrol) >= currPump.dist) {
			   accDist += currPump.petrol;
			   accDist -= currPump.dist;
		 } else {
			 return -1;
		 }
     }

     if(accDist >= 0) {
    	 return startIndex;
     } else {
    	 return -1;
     }

 }
}




class Pump {
 int petrol;
 int dist;
 int pos;
 public Pump(int p, int d, int pos) {
	 petrol = p;
	 dist = d;
	 this.pos = pos;
 }
}