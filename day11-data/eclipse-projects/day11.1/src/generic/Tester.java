package generic;

public class Tester {

	public static void main(String[] args) {
	//create a holder : holding int value
		Holder<Integer> h1=new Holder<>(1234);//diamond operator : implicit conversion : auto box int --->Integer
		int data=h1.getRef();//implicit : auto un boxing Integer --> int
		//create a holder : holding string value
		Holder<String> h2=new Holder<>("1234");//implicit conversion by javac : NONE
		String s=h2.getRef();//no explicit down casting required
		h1=h2;//javac error
	}

}
