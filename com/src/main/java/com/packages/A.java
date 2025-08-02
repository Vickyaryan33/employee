package com.packages;

import java.util.Arrays;
import java.util.*;

public class A {
	public static void main(String[] args) {
		List<Integer> int1 = Arrays.asList(1, 2,3, 3, 3, 5, 6);
		System.out.println(int1);
	   int count=0;
		for(int n:int1) {
			count++;
		}
		System.out.println(count);
		List<Integer> int2  = new ArrayList<>();
	for(int n:int1) {
		if (!int2.contains(n)) {
            int2.add(n);
        }
	}
	System.out.println(int2);	
	}
}
