package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import static utils.GenericUtils.*;

public class Test3 {

	public static void main(String[] args) {
		ArrayList<Double> doubles=new ArrayList<>(Arrays.asList(1.0,2.6,3.7,4.7,6.3));
		removeAltElements(doubles);
		System.out.println(doubles);
		HashSet<String> strings=new HashSet<>(Arrays.asList("1","2","3","4","5"));
		removeAltElements(strings); 
		System.out.println(strings);

	}

}
