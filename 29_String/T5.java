class A {
	public static void main(String[]args){
		String s = "ramanna";

		int n = -1;
		while((n=s.indexOf('a',n+1)) != -1){
			System.out.print(n+" ");
		}
	}
}