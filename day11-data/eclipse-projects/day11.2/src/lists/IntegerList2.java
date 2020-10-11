package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * Objectives in Integer list
0. Create ArrayList of integers & populate it.
1. check if element exists in the list.
2. disp index of 1st occurance of the elem
3. double values in the list --if elem val > 20
4. remove elem at the specified index

6. Sorting : asc order

 */
public class IntegerList2 {

	public static void main(String[] args) {
		// Create empty ArrayList of integers , size = 0 , init capa=10
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("list contents " + list);
		System.out.println("list size " + list.size());// 0
		int[] data = { 10, 20, 13, 34, -56, 10, 20, 4567, 10 };
		// populate AL from array data.
		for (int i : data) // which impl conversion javac : NO i=data[0], i=data[1]
			list.add(i);// which impl conversion javac : auto boxing list.add(new Integer(i));
		// exists : contains
		System.out.println("orig list "+list);
		System.out.println(list.contains(10) ? "Exists" : "Doesn't Exist");
		System.out.println("1st occurrence " + list.indexOf(10) + " last  occurrence " + list.lastIndexOf(10));
		// double values in the list --if elem val > 20
		for (int i = 0; i < list.size(); i++)
			if (list.get(i) > 20) // impl conversion : auto un boxing
				System.out.println("orig value " + list.set(i, list.get(i) * 2));

		System.out.println("list contents after doubling " + list);
		// remove elem at the specified index
		System.out.println("Removed " + list.remove(0));
		System.out.println("list contents after remove " + list);
		// sort the integers : asc order
		Collections.sort(list);
		// display sorted list
		System.out.println("sorted list " + list);
		// create another populated AL having the SAME contents n SAME order as list
		ArrayList<Integer> list2 = new ArrayList<>(list);
		System.out.println("list2 contents " + list2);
		// convert AL ----> int[] ?
		// Object[] array = list.toArray();
		Integer[] data2 = new Integer[list.size()];
		System.out.println("orig array data" + Arrays.toString(data2));
		System.out.println(data2);
		Integer[] array = list.toArray(data2);
		System.out.println("array data after toArray" + Arrays.toString(array));
		System.out.println(data2 == array);
	}

}
