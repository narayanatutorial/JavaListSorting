package com.narayanatutorial.primitive.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListStringSorting {

	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("Tutorial");
		list.add("Narayana");
		list.add("Swamy");
		System.out.println("****Before Sorting****");
		list.stream().forEach(name -> System.out.println(name));

		Collections.sort(list);

		System.out.println("****After Sorting****");
		list.stream().forEach(name -> System.out.println(name));
		list.clear();

		list = new ArrayList<String>();
		list.add("Tutorial");
		list.add("Narayana");
		list.add("Swamy");
		// sorting using stream
		System.out.println("**** Sorting using list stream ****");
		list.stream().sorted().forEach(value -> System.out.println(value));

	}
}
