package com.collectionspractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add("A");
		al.add("B");
		al.add("G");
		al.add("X");
		al.add("Y");
		al.add("T");
		System.out.println("First arraylist elements : "+al);
		
		ArrayList al2=new ArrayList();
		al2.addAll(al);
		System.out.println("Second arraylist elements : "+al2);
		
		al2.removeAll(al);
		System.out.println("After removing all arraylist elements : "+al2);
		
		//Sort elements
		System.out.println("arraylist elements before sorting : "+al);
		
		//Sorting in ascending order
		Collections.sort(al); 		
		System.out.println("arraylist elements after sorting : "+al);

		//Sorting in descending order
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("arraylist elements after sorting in reverse order: "+al);
		
		Collections.shuffle(al);
		System.out.println("arraylist elements after Shuffling order: "+al);
		
		

	}

}
