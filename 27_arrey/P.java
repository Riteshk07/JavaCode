
class A{
	public static void main (String[]args){
		boolean [] x= new boolean[2];
		System.out.println(x[0]);
		System.out.println(x[1]);

		x[0]=1;         // you can not assign a value of bool 1 or 0
		x[1]=1;

		System.out.println(x[0]);
		System.out.println(x[1]);
	}
}