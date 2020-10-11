package sets;

import java.util.Arrays;
import java.util.HashSet;

public class IntegerSet {

	public static void main(String[] args) {
		// create empty HashSet that can store Integer type of refs.
		//HashSet() : size=0, init capa=16, load factor=.75
		HashSet<Integer> hs=new HashSet<>();
		int[] data= {12,34,20,12,-67,789,1234,12,34};
		System.out.println("Array : "+Arrays.toString(data));
		//populate HS with data
		for(int i : data)
			System.out.println("Added "+hs.add(i));//auto boxing : hs.add(new Integer(i))
		System.out.println("HS via toString "+hs);
		System.out.println("HS via for-each");
		for(int i : hs)//auto un boxing
			System.out.print(i+" ");
		//contains
		System.out.println("Contains "+hs.contains(-67));//true
		hs.remove(789);
		System.out.println("HS after remove "+hs);
		
		
		
				

	}

}
