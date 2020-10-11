package sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		//LinkedHashSet : ordered set imple class (maintains order of insertion)
		List<String> strings=Arrays.asList("abc","one","fruits","xyz","hello","products","one","abc");
	//	strings.set(0,"ABCDEFG");
		System.out.println(strings);
		//convert List ---> HashSet(constr / addAll / for ... , display the same  
		HashSet<String> hs=new HashSet<>(strings);
		System.out.println("HS "+hs);
		
		//convert List ---> LinkedHashSet , display the same 
		LinkedHashSet<String> lhs=new LinkedHashSet<>(strings);
		System.out.println("LHS "+lhs);
		//convert List --> TreeSet , display the same 
		TreeSet<String> ts=new TreeSet<>(strings);//String's compareTo : N.O 
		System.out.println("TS "+ts);

	}

}
