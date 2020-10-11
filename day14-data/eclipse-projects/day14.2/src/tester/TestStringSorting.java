package tester;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import custom_comp.StringDescComparator;

public class TestStringSorting {

	public static void main(String[] args) {
		String[] names= {"gold","silver","abc","platinum","cde","xy","abc123"};
		//convert array --> fixed size list
		List<String> list = Arrays.asList(names);
		System.out.println(list);
	//	list.set(0,"dgadgfdgdf");
		Collections.sort(list);//will invoke String class's compareTo method internally : Natural ordering 
		System.out.println("Natrual order "+list);
		//display strings in reverse order : sorting : Custom ordering 
		Collections.sort(list, new StringDescComparator());
		System.out.println("Reverse order "+list);

	}

}
