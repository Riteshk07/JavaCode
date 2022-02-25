
class A  {
	void pro(){System.out.println("Ritesh ");}
}

class G extends A{
	void pro(){System.out.println("Is ");}
}

class B extends A{
	void pro(){System.out.println("A ");}
}

class C extends B{
	void pro(){System.out.println("Programmer ");}
}

class X{
	public static void main (String[]args){
		A x = new C();
		x.pro(); 

        G g = new G();
		g.pro();

		B y = new C();
		y.pro(); 

		C z = new C();
		z.pro(); 

	}
} 