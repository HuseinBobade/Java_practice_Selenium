package com.collectionspractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3_String {

	public static void main(String[] args) {
		
		String str[]= {"Dog","Cat","Mouse"};
		
		for(String value :str) {
			
			System.out.println(value);
		}
		
		ArrayList animals= new ArrayList(Arrays.asList(str));
		
		System.out.println(animals);
		
	}

}
