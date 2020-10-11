package sets;

import java.util.HashSet;
import java.util.Scanner;

import com.app.core.Emp;

public class EmpSet {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create empty HS to store emp type of refs.
			HashSet<Emp> empSet = new HashSet<>();
			Emp e1 = new Emp(101, "abc", "hr", 12345);
			Emp e2 = new Emp(101, "abc2", "hr", 12345);
			Emp e3 = new Emp(10, "abc3", "hr", 12345);
			Emp e4 = new Emp(101, "abc", "rnd", 12345);
			Emp e5 = new Emp(45, "abc2", "finance", 22345);
			// populate HS
			System.out.println("Added " + empSet.add(e1));// true
			System.out.println("Added " + empSet.add(e2));// false
			System.out.println("Added " + empSet.add(e3));// true
			System.out.println("Added " + empSet.add(e4));// true
			System.out.println("Added " + empSet.add(e5));// true

			System.out.println("HS " + empSet);
			System.out.println("size of a set " + empSet.size());
			// System.out.println(e1.hashCode()+" "+e2.hashCode()+" "+e3.hashCode());
			// search for employee : i/p : id n dept id
			System.out.println("Enter emp id n dept id");
			int id=sc.nextInt();
			String dept=sc.next();
			Emp ref=new Emp(id, dept);
			System.out.println(empSet.contains(ref)?"Exists":"Doesn't Exist");
			System.out.println("Display via for-each");
			for(Emp e : empSet)
				System.out.println(e);
			
			

		}
	}

}
