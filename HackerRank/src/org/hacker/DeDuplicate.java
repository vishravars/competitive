package org.hacker;

public class DeDuplicate {

	
	
	Node RemoveDuplicates(Node head) {
		 Node curr = head;   
		    
		 while(curr != null) {
		   
		   while(curr.next != null && curr.data == curr.next.data) {
		       curr.next = curr.next.next;
		       curr.next.next = null;
		   }  
		     
		   head = head.next;    
		 } 
		 return head;
	}
	
	int FindMergeNode(Node headA, Node headB) {
		
		Node hA = headA;
		Node hB = headB;
		
		while(true) {
			if(headA.next == headB.next) {
				return headA.next.data;
			}
			
			if(hA.next != null) 
				hA = hA.next;
			else
				hA = headA;
			if(hB.next != null)
				hB = hB.next;
			else
				hB = headB;
		}
	}
	
}
