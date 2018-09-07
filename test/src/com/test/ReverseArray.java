package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseArray {
	public static void main(String s[]) {
		Scanner sc = new Scanner(System.in);
		int num =(Integer)sc.nextInt();
		Integer[] var = new Integer[num];
		for(int i=0;i<var.length;i++) {
			var[i] = sc.nextInt();
		}
		reverseNumber(var);
		Arrays.stream(var).forEach(System.out::println);
		
	}
	public static Integer[] reverseNumber(Integer[] var) {
		    List<Integer> list = Arrays.asList(var);
	        Collections.reverse(list);
	        return (Integer[]) list.toArray();
	}

}
