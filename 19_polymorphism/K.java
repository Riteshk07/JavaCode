class A{
	void proA(){System.out.println("proA");}
}

class B extends A{
	void proB(){System.out.println("proB");}
}

class C extends B {
	void proC(){System.out.println("proC");}
}

class X {
	public static void main (String[]args){
		C x = new C();
		x.proC(); x.proB(); x.proA();

		B y = new C();
		/*y.proC();*/ 
		y.proB(); y.proA();

		A z = new C();
		// z.proC(); z.proB(); 
		z.proA();

		Object o = new C();
		// o.proC(); o.proB(); o.proA();
		System.out.println(o.toString());
	}
}