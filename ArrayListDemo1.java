package com.collectionspractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		//Declare ArrayList
		
		//ArrayList al= new ArrayList(); 
		//ArrayList <Integer>al= new ArrayList<Integer>(); //only numbers or integer data
		//ArrayList<String> al= new ArrayList<String>(); //only string data
		
		ArrayList al= new ArrayList();
		
		//now add elements to arrayList
		
		al.add(100);
		al.add("Selenium");
		al.add(15.5);
		al.add('A');
		al.add(true);
		
		System.out.println(al);
		
		//size();
		
		System.out.println("Number of Elements in arraylist are: "+al.size());
		
		//remove
		
		al.remove(1);
		al.remove("Selenium");
		//al.remove('100');
		
		System.out.println("After removing elements in arraylist are: "+al.size());
		System.out.println(al);
		
		//insert data at specific location 
		al.add(1, "Java");
		System.out.println(al);
		
		//retrieve specific element
		al.get(4);
		System.out.println(al.get(4)); // 4 is index of element
		
		//change/replace the existing value of element
		al.set(0,200);
		System.out.println(al);
		
		//searching element in arraylist
		al.contains('A');
		System.out.println(al.contains('A'));
		System.out.println(al.contains("C#"));
		
		//isEmpty tocheck if Arraylist is empty
		al.isEmpty();
		System.out.println(al.isEmpty());
		
		//reading all data from ArrayList
		//approch 1 using for loop
		
		System.out.println("Reading Elements using for loop: ");
		for(int i=0; i<al.size();i++) {
			
			System.out.println(al.get(i));
		}
		
		//approch 2 using foreach or advance for loop
		
		System.out.println("Reading Elements using for..each loop: ");
		for(Object e:al) {
			System.out.println(e);
		}
		
		//approch 3 using iterator
		System.out.println("Reading Elements using iterator: ");
		
		Iterator it=al.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		
		
		
		
	}

}
