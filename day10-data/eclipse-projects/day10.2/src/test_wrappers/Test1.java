package test_wrappers;

import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
		Integer i1 = new Integer(100);// boxing
		int data = i1.intValue();// un boxing
		i1 = 1234;// auto boxing : Integer i1=new Integer(1234); : by javac
		data = i1;// auto un boxing : data=i1.intValue();
		Date d1 = new Date();//date cls instance
	//	d1+= 10;//ref type : no arithmetic ops.
		i1 ++;//auto un box , inc , auto box
		System.out.println(i1);
		float f1=12.34f;
		double d=f1;//auto promotion / widening : javac
	//	Double d2=f1;//auto box (float---->Float) ---X--Double
		Number n1=123.4567;//double--->Double(auto boxing) ---up casting ---Number
		n1=1234;//int --->Integer ---> Number
		Object o=true;//boolean -->Boolean --->Object
		o=123.456;
		

	}

}
