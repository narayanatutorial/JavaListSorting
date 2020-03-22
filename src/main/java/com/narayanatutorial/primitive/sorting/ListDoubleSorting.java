package com.narayanatutorial.primitive.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDoubleSorting {

	public static void main(String args[]) {
		List<Double> list = new ArrayList<Double>();
		list.add(123.5);
		list.add(34.4);
		list.add(567.3);
		System.out.println("****Before Sorting****");
		list.stream().forEach(name -> System.out.println(name));

		Collections.sort(list);

		System.out.println("****After Sorting****");
		list.stream().forEach(name -> System.out.println(name));

		list.clear();

		list = new ArrayList<Double>();
		list.add(123.5);
		list.add(34.4);
		list.add(567.3);

		// sorting using stream
		System.out.println("**** Sorting using list stream ****");
		list.stream().sorted().forEach(value -> System.out.println(value));

	}
}
