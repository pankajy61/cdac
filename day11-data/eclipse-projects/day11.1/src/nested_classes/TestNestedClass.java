package nested_classes;

public class TestNestedClass {

	public static void main(String[] args) {
		//how to invoke method of the inner class ?
		Outer.Inner in=new Outer(34).new Inner(67);
		in.show();
		Outer outer=new Outer(12);
		outer.display();

	}

}
