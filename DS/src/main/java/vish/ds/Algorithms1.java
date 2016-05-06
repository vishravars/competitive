package vish.ds;

public class Algorithms1 {

	int array[] = {6,3,8,9,11,2,7,4,14,11};
	
	public void linearSearch(int value) {
		String indexString = "";
		boolean foundValue = false;
		for(int i=0; i< array.length; i++) {
			if (array[i] == value) {
				foundValue = true;
				indexString += i + " ";
			}
		}
		
		if(foundValue)
			System.out.println("Found the value are index(es) " + indexString);
		else
			System.out.println("Value " + value + " Not found");
		
	}
	
	public void bubbleSort() {
		for(int i = array.length-1; i > 1; i--) {
			for(int j = 0; j < i; j++) {
				if(array[j] > array[j+1]) {
					swapValues(j, j+1);
				}
			}
		}
	}
	
	public void selectionSort() {
	
		for(int i=0; i< array.length; i++) {
			
			int minIndex = i;
			
			for(int j=i+1; j< array.length; j++) {
				
				if(array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			swapValues(minIndex, i);
		}
	}
	
	public void findSmallestLargest() {
		
		int smallest = array[0];
		int largest = array[0];
		
		for(int i=0; i< array.length; i++) {
			if(array[i] > largest)
				largest = array[i];
			if(array[i] < smallest)
				smallest = array[i];
		}
		
		System.out.println("Largest: " + largest + ", Smallest: " + smallest);
		
	}
	
	public void insertionSort() 
	{	
		//6,3,8,9,11,2,7,4,14,11
		
		for(int i = 1; i< array.length; i++) {
			
			int j = i;
			
			int toInsert = array[i];
			
			while(j > 0 && array[j-1] > toInsert) {
				array[j] = array[j-1];
				j--;
			}
			array[j] = toInsert;
		}
	}
	
	private void printAllArrayElements() {
		for(int i: array) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}
	
	private void swapValues(int indexOne, int indexTwo) {
		int temp = array[indexOne];
		array[indexOne] = array[indexTwo];
		array[indexTwo] = temp;
		
	}
	
	public void binarySearch(int value) {
		
		int lowIndex = 0;
		int highIndex = array.length;
		
		while(lowIndex <= highIndex) {
			int middle = (highIndex + lowIndex ) / 2;
			
			if(value > array[middle])
				lowIndex = middle + 1;
			else if(value < array[middle])
				highIndex = middle - 1;
			else
			{
				System.out.println("\nFound the element at index " + middle);
				lowIndex = highIndex+1; // this stops the while loop
			}
			
		}
		
	}

	
	public static void main(String[] args) 
	{
		
		Algorithms1 algo = new Algorithms1();
		
		//algo.linearSearch(11);
		
		//algo.bubbleSort();
		//algo.selectionSort();
		algo.insertionSort();
		algo.printAllArrayElements();
		
		algo.binarySearch(2);
		
		algo.findSmallestLargest();
		
	}
	
}
