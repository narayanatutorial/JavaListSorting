package com.narayanatutorial.primitive.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListLongSorting {

	public static void main(String args[]) {
		List<Long> list = new ArrayList<Long>();
		list.add(123L);
		list.add(34L);
		list.add(567L);
		System.out.println("****Before Sorting****");
		list.stream().forEach(name -> System.out.println(name));

		Collections.sort(list);

		System.out.println("****After Sorting****");
		list.stream().forEach(name -> System.out.println(name));

		list.clear();

		list = new ArrayList<Long>();
		list.add(123L);
		list.add(34L);
		list.add(567L);

		// sorting using stream
		System.out.println("**** Sorting using list stream ****");
		list.stream().sorted().forEach(value -> System.out.println(value));

	}
}
