package custom_comp;

import java.util.Comparator;

public class StringDescComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		System.out.println("string desc comapare");
		return o2.compareTo(o1);
	}
	

}
