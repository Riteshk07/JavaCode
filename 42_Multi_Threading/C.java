
class A {
	public static void main (String [] args){
		ThreadGroup tg = new ThreadGroup("ABC");
		System.out.println(tg.getMaxPriority());
	}
}