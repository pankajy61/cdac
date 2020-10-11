package utils;

import java.util.Collection;
import java.util.Iterator;

import static java.lang.Math.sqrt;

public class GenericUtils {
// Write a generic method display to display contents of ANY Collection (Using for-each)
	public static void display(Collection<?> anyColl) {
		for (Object c : anyColl)
			System.out.println(c);
	}

	// Write a generic method to return square root of sum of numbers passed in any
	// Collection.
	public static double squqreRoot(Collection<? extends Number> anyColl) {
		double sum = 0;
		for (Number n : anyColl)
			sum += n.doubleValue();
		return sqrt(sum);
	}

	// Write a generic method to remove alternate elements of ANY Collection
	public static void removeAltElements(Collection<?> anyColl) {
		Iterator<?> itr = anyColl.iterator();
		boolean remove = false;
		while (itr.hasNext()) {
			itr.next();
			if (remove)
				itr.remove();
			remove = !remove;
		}
	}

}
