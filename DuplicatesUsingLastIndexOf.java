package com.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicatesUsingLastIndexOf {

	public static void main (String [] args) {
		List<String> list=new ArrayList<>(Arrays.asList("anu","bcd","dfe","anu"));
		
		list.stream().filter(element->list.indexOf(element)!=list.lastIndexOf(element)).distinct().collect(Collectors.toList()).forEach(System.out::println);
	}
}
