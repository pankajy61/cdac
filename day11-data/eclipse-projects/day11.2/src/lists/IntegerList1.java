package lists;

import java.util.ArrayList;

/*
 * Objectives in Integer list
0. Create ArrayList of integers & populate it.
1. check if element exists in the list.
2. disp index of 1st occurance of the elem
3. double values in the list --if elem val > 20
4. remove elem at the specified index
5. remove by elem. -- rets true /false.
6. Sorting : asc order

 */
public class IntegerList1 {

	public static void main(String[] args) {
		// Create empty ArrayList of integers , size = 0 , init capa=10
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("list contents " + list);
		System.out.println("list size " + list.size());//0
		int[] data= {10,20,13,34,-56,10,20,4567,10};
		// populate AL from array data.
		for (int i : data) //which impl conversion javac : NO i=data[0], i=data[1]
			list.add(i);// which impl conversion javac : auto boxing list.add(new Integer(i));
	//	list.add(0, null);
		//display list
		System.out.println("List via toString "+list);
		System.out.println("List contents via for-loop");
		//for loop
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		//for-each
		System.out.println("List contents via for-each");
		for(int i : list)//implicit iterator int i =Integer.intValue(null)
			System.out.println(i);

	}

}
