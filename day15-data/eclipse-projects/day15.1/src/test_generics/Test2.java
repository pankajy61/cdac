package test_generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		// public static void shuffle(List<?> list)
		List<Integer> l1=Arrays.asList(12,34,56,1,2,4,5);
		System.out.println(l1);
		Collections.shuffle(l1);
		System.out.println("Shuffled list "+l1);
		List<String> strings=Arrays.asList("sdf","fd","3543","vcbxcv");
		Collections.shuffle(strings);
		System.out.println("Shuffled string list "+strings);
		
		

	}

}
