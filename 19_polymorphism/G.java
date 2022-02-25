class A {
	void pro1(){System.out.println("Good Morning Ji... ");}
	public void display(){
        System.out.println(toString()+", "+hashCode()+"\n");
    }
}

class G extends A{
	void pro2(){System.out.println("Hello Ji... ");}
}

class B extends A{
	void pro3(){System.out.println("Bolo Ji... ");}
}

class C extends B{
	void pro4(){System.out.println("Achha Ji... ");}
}

class X{
	public static void main (String[]args){
		C x = new C();
		x.pro1(); x.pro3(); x.pro4(); x.display();

		B y = new C();
		y.pro1(); y.pro3(); y.display();

		A z = new C();
		z.pro1(); z.display();

		A a = new G();
		a.pro1(); a.display();

		G g = new G();
		g.pro1(); g.pro2(); g.display();

	}
} 