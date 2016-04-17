package org.hacker;

/*
Insert Node at the end of a linked list 
head pointer input could be NULL as well for empty list
Node is defined as*/ 
public class Node {
   int data;
   Node next;

   Node InsertNth(Node head, int data, int position) {
       Node pprev = null;
	   int curr = 0;
       Node newNode = new Node();
       newNode.data = data;
       
       if(head == null){
           return newNode;
       }
       else {
    	   
       }
	   return head;
   }
   
}

  // This is a "method-only" submission. 
  // You only need to complete this method. 


