package org.hacker;

import java.math.BigInteger;
import java.util.Scanner;

public class BigNumber {

	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		BigInteger a = null;
		BigInteger b = null;
		
		String value = stdin.nextLine();		
		a = new BigInteger(value);
		value = stdin.nextLine();
		b = new BigInteger(value);
		
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
	}
}
