package vish.ds;

public class LinkedList {
	
	Link first;
	
	LinkedList() {
		
	}
	
	public void insert(int value) {
		
		Link newLink = new Link(value);
		
		newLink.next = first;
		
		first = newLink;
		
	}
	
	public void printAllElements() {
		
		Link pcurr = first;
		
		if(pcurr.next == null) {
			System.out.print(pcurr.data + " ");
			return;
		}
		
		do {
			System.out.print(pcurr.data + " ");
			pcurr = pcurr.next;
		}
		while(pcurr != null);
		
		System.out.println();
	}
	
	public Link find(int key) {
		
		Link pcurr = first;
		
		while(pcurr != null && pcurr.data != key) {
			pcurr = pcurr.next;
		}
		
		return pcurr;
		
	}
	
	public void deleteAllValues(int key) {
		Link pcurr = first;
		Link pprev = pcurr;
		Link pdel = null;
		while(pcurr != null ) 
		{
			if(pcurr.data == key) {
				if(pcurr == first) {
					first = pcurr.next;
					pdel = pcurr;
					pcurr = pcurr.next;
					pprev = pcurr;
				} else {
					pprev.next = pcurr.next;
					pdel = pcurr;
					pcurr = pcurr.next;
					pdel.next = null;
				}
			} else {
				pprev = pcurr;
				pcurr = pcurr.next;
			}
		}
	}
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		for(int i=0; i< 10; i++) {
			ll.insert(i);
		}
		
		ll.printAllElements();
		
		System.out.println("Search result " + ll.find(7));
		
		ll.deleteAllValues(1);
		
		ll.printAllElements();
		
	}
	
}

class Link {
	int data;
	Link next;
	
	Link(int p_data) {
		this.data = p_data;
	}
	
}