package nested_classes;

public class Outer2 {
	private int i=10;
	
	private class Inner2
	{
		private int i=20;
		void test(int i)
		{
			//display method local i 
			System.out.println(i);
			// 20 : Inner's i
			System.out.println("Inner's i "+this.i);
			//10 : Outer's i : Outer .this
			System.out.println("Outer's i "+Outer2.this.i);
			
		}
	}
	public static void main(String[] args) {
		Outer2.Inner2 innerRef=new Outer2().new Inner2();
		innerRef.test(30);
	}
}
