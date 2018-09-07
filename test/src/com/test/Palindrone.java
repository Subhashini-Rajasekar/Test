package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindrone {
	
	public static void main(String args[])
	{
		/*Scanner sc = new Scanner(System.in);
		String normalStr = (String)sc.next();*
		/
		 * 
		 */
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String normalStr = null;
		try {
			normalStr = bf.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(normalStr);
		String onlyStr = getOnlyStrs(normalStr);
		System.out.println(onlyStr);
		String reverstr = reverseStr(onlyStr);
		System.out.println(reverstr);
		//Arrays.stream(var).forEach(System.out::println);
		if(onlyStr.equalsIgnoreCase(reverstr)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

	public static String getOnlyStrs(String s) {
		Pattern pattern = Pattern.compile("[^a-z A-Z]");
		Matcher matcher = pattern.matcher(s);
		String nrmalStr = matcher.replaceAll("");
		return nrmalStr;
	}
	public static String reverseStr(String s) {
		int sizeA = s.length();
		String reverseStr="";
		for(int i=sizeA-1;i>=0;i--) {
			reverseStr = reverseStr+s.charAt(i);
			
		}
		return reverseStr;
	}
}
