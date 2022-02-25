// constructor overloading allowed in Java
class A {
	A(int a){
		System.out.println("Hello ji");
	}
	A(String s){
		System.out.println("Bye ji");
	}
	public static void main (String[]args){
		new A(10);
		new A("Ritesh");
	}
}