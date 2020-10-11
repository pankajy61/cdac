package nested_classes;

public class Outer {
	// can contain static n non static members
	private int i;
	private static int j;
	static {
		j = 100;
	}

	public Outer(int i) {
		super();
		this.i = i;
	}

	public void display() {
		// display outer's n inner's state
		System.out.println("Outer's i " + i + " static member  " + j);
		//display inner's state
		//create instance of the inner class
		Inner in=new Inner(1234);
		System.out.println("Inner's state from outer's non static method "+in.a+" inner's static "+Inner.b);
	}

	public static void test() {
		// can access only static members directly (w/o inst)
		System.out.println("Outer's static member " + j);
		//display inner's state : a
		Outer outer=new Outer(3456);//create instance of outer cls (enclosing cls instance)
		Outer.Inner in=outer.new Inner(1234);
		System.out.println("Inner's state from outer's non static method "+in.a+" inner's static "+Inner.b);

		
	}

	// non static netsed class (inner class) : instance member of the outer class
	public class Inner {
		// can contain ONLY non static members .
		// JDK 1.8 onwards : can contain static final data members.
		private int a;
		private static final int b = 200;

		// constr : YES
		public Inner(int a) {
			super();
			this.a = a;
		}

		// non static methods
		void show() {
			// can it access i , j ,a : all of them
			System.out.println("inner's member " + a);
			System.out.println("Outer's members " + i + " " + j);// Every inner class is implicitly give Outer.this :
																	// same scope
		}
		// static method
		/*
		 * static void testMe() {
		 * System.out.println("Can inner csl contain static methods : NO"); }
		 */

	}

}
