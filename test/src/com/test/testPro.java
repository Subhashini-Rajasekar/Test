package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class testPro {

	public static void main (String[] args) throws java.lang.Exception 
 	{

     	Scanner sc = new Scanner(System.in);
        //System.out.println(sc.nextInt());
      
        int number = sc.nextInt();
        List<String> list = new ArrayList<String>();
		for(int i =0; i < number; i++){
			list.add(sc.next().toLowerCase());
		}
		

		Collections.sort(list, Collections.reverseOrder());
		for(String output : list){
			System.out.println("print:"+output);
		}
		
		
	}
		
	}


