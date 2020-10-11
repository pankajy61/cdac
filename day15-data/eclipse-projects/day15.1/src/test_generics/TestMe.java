package test_generics;

import java.util.ArrayList;
import java.util.HashSet;

public class TestMe {

	public static void main(String[] args) {
		Emp e = new Manager();
		e = new SalesManager();
		ArrayList<Manager> mgrs = new ArrayList<>();
		HashSet<Manager> hs=new HashSet<>();
		ArrayList<Emp> emps=mgrs;
		ArrayList<Object> objs=mgrs;
		ArrayList<?> list=mgrs;
		ArrayList<Emp> empList=new ArrayList<>(hs);
		
		
	}

}
