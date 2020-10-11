package sets;

import java.util.HashSet;

import com.app.core.Emp;

public class EmpSet {

	public static void main(String[] args) {
		// create empty HS to store emp type of refs.
		HashSet<Emp> empSet=new HashSet<>();
		Emp e1=new Emp(101, "abc", "hr", 12345);
		Emp e2=new Emp(101, "abc", "hr", 12345);//e1.equals(e2) ---true
		Emp e3=e1;
		Emp e4=new Emp(10, "abc", "hr", 12345);
		Emp e5=new Emp(100, "abc2", "rnd", 22345);
		//populate HS
		System.out.println("Added "+empSet.add(e1));//true
		System.out.println("Added "+empSet.add(e2));//false
		System.out.println("Added "+empSet.add(e3));//false
		System.out.println("Added "+empSet.add(e4));//true
		System.out.println("Added "+empSet.add(e5));//true
		
		System.out.println("equals "+e1.equals(e2));
		System.out.println("HS "+empSet);
		System.out.println("size of a set "+empSet.size());
		System.out.println(e1.hashCode()+" "+e2.hashCode()+" "+e3.hashCode());

	}

}
