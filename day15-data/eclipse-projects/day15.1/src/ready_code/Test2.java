package ready_code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,12,34,56,-67,100,20,10,12);
		//Attach Iterator to traverse over all the elements
		Iterator<Integer> itr=list.iterator();
		System.out.println("Display elems using explicit Iterator");
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		System.out.println();
		HashSet<Integer> hs=new HashSet<>(list);
		hs.add(1234);
		//attach itr to HS
		Iterator<Integer> setItr=hs.iterator();
		while(setItr.hasNext())
			System.out.print(setItr.next()+" ");

	}

}
