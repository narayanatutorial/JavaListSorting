package com.narayanatutorial.primitive.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListIntegerSorting {

	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(123);
		list.add(34);
		list.add(567);
		System.out.println("****Before Sorting****");
		list.stream().forEach(name -> System.out.println(name));

		Collections.sort(list);
		
		System.out.println("****After Sorting****");
		list.stream().forEach(name -> System.out.println(name));
		
		list.clear();
		
		list = new ArrayList<Integer>();
		list.add(123);
		list.add(34);
		list.add(567);
		
		//sorting using stream 
		System.out.println("**** Sorting using list stream ****");
		list.stream().sorted().forEach(value->System.out.println(value));
		

	}
}
