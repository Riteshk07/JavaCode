class A {
	public static void main(String[]args){
		String s = "ramanna";

		int n = s.length()+1;
		while((n=s.lastIndexOf('a',n-1)) != -1){
			System.out.print(n+" ");
		}
	}
}