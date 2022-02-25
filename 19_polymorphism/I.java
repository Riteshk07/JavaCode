
class A  {
	void pro(){System.out.println("proA ");}
}

class G extends A{
	void pro(){System.out.println("proB ");}
}

class B extends A{
	void pro(){System.out.println("proC");}
}

class C extends B{
	void pro(){System.out.println("ProD ");}
}

class X{
	public static void main (String[]args){
		A x = new A();
		x.pro(); 

        A g = new G();
		g.pro();

		A y = new B();
		y.pro(); 

		A z = new C();
		z.pro(); 

	}
} 