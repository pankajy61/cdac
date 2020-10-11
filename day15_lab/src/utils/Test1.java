package utils;

import java.time.LocalDate;
import static java.time.LocalDate.*;
import static utils.GenericUtils.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<LocalDate> dates = Arrays.asList(of(1990, 1, 11), of(2020, 12, 23), of(2018, 12, 31));
		display(dates);
		HashSet<Integer> ints=new HashSet<>(Arrays.asList(12,34,56,567,10,12));
		display(ints);
	}

}
