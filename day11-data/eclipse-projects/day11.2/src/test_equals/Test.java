package test_equals;

public class Test {

	public static void main(String[] args) {
		Object e1=new Emp(101, "abc", "finance", 12345);
		Object e2=new Emp(101, "abc", "finance", 12345);
		//Object e3=e1;
		System.out.println(e1.equals(e2));
	//	System.out.println(e1.equals(e3));
		/*
		 * System.out.println(e1==e2);//f System.out.println(e1==e3);//t
		 */
		String s="hello";
		System.out.println(e1.equals(e2));
	}

}
