package org.hacker;


abstract class Arithmetic {
	public abstract int add(int x, int y);
}

public class Adder extends Arithmetic {
	@Override
	public int add(int x, int y) {
		return x+y;
	}
	
	
	public static void main(String[] args) {
		Adder X=new Adder();
		String superClass = X.getClass().getSuperclass().getName();
		String superClassArr[] = superClass.split("\\.");
		
        System.out.println("My superclass is: "+superClassArr[superClassArr.length-1]);    
        System.out.print(X.add(10,32)+" "+X.add(10,3)+" "+X.add(10,10)+"\n");
	}
}
