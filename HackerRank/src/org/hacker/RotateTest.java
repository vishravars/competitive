package org.hacker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateTest {

	public static void main(String[] args) {
		List lst = new ArrayList();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		
		Collections.rotate(lst, 3);
		
		System.out.println(lst);
		
	}
}
