package com.narayanatutorial.JavaComparatorSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ComparatorSortingByName {
	public static void main(String[] args) {

		DataVO vo = null;
		List<DataVO> list = new ArrayList<DataVO>();
		vo = new DataVO();
		vo.setName("Tutorial");
		vo.setStartdate("2020-01-17");
		list.add(vo);

		vo = new DataVO();
		vo.setName("Narayana");
		vo.setStartdate("2020-01-19");
		list.add(vo);

		vo = new DataVO();
		vo.setName("Swamy");
		vo.setStartdate("2020-01-18");
		list.add(vo);

		System.out.println("****Before Sorting****");
		list.stream().forEach(datavo -> System.out.println(datavo.getName()));

		// Ascending order
		Collections.sort(list, new Comparator<DataVO>() {
			public int compare(DataVO s1, DataVO s2) {
				return (s1.getName().compareTo(s2.getName()));
			}
		});

		System.out.println("****Asecnding After Sorting****");
		list.stream().forEach(datavo -> System.out.println(datavo.getName()));

		// Descending order
		Collections.sort(list, new Comparator<DataVO>() {
			public int compare(DataVO s1, DataVO s2) {
				return (s2.getName().compareTo(s1.getName()));
			}
		});

		System.out.println("****Desecnding After Sorting****");
		list.stream().forEach(datavo -> System.out.println(datavo.getName()));

	}
}
