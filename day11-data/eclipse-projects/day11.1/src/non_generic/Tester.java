package non_generic;

public class Tester {

	public static void main(String[] args) {
		//create a Holder cls instance  to hold an int value
		Holder h1=new Holder(1234);//int ---> Integer(auto boxing) ---> Object (up casting)
	//	int data=h1.getRef();
		int data=(Integer)h1.getRef();//explicit : down casting  , auto un boxing : javac
		//create a another Holder cls instance  to hold a string
		Holder h2=new Holder("1234");//up casting string ----> obj
		String s=(String)h2.getRef();
		h1=h2;//why no err ? h1 , h2 : Holder
		data=(Integer)h1.getRef();//class cast exception
		System.out.println(data);
	}

}
