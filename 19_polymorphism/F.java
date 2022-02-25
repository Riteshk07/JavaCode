class A {}

class G extends A{}

class B extends A{}

class C extends B{}

class E extends B{}

class X{
	public static void main (String[]args){
		// Object x = new C();

		// 		//  C-obj IS-A B
		// System.out.println(x instanceof B);

		// 		//  C-obj IS-A C
		// System.out.println(x instanceof C);

		// 		//  C-obj IS-A G
		// System.out.println(x instanceof G);
		
		// A y = new C();
		// System.out.println(y instanceof Object);
		// System.out.println(y instanceof A);
		// System.out.println(y instanceof B);
		// System.out.println(y instanceof C);
		// System.out.println(y instanceof G);
		// System.out.println(y instanceof E);

        B y = new C();
		System.out.println(y instanceof Object);
		System.out.println(y instanceof A);
		System.out.println(y instanceof B);
		System.out.println(y instanceof C);
		// System.out.println(y instanceof G);    // error 
		System.out.println(y instanceof E);
		
	}
} 