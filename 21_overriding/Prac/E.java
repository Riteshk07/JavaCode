interface I {
    void pro();
}
class A implements I  {
	public void pro(){System.out.println("proA ");}
}

class G extends A{
	public void pro(){System.out.println("proB ");}
}

class B extends A{
	public void pro(){System.out.println("proC");}
}

class C extends B{
	public void pro(){System.out.println("ProD ");}
}

class X{
	public static void main (String[]args){
		I x = new A();
		x.pro(); 

        I a = new G();
		a.pro();

		I y = new B();
		y.pro(); 

		I z = new C();
		z.pro(); 

	}
} 