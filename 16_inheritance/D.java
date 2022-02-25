/*MULTILEVEL INHERITANCE*/

class X /*extends Object*/ {
	// Object is a GOD class in java 
    void info(){
        System.out.println("CLASS X INHERIT FROM GOD CLASS");
    }
}

class A extends X {
    void pro(){
        System.out.println("Hii");
    }
	public static void main (String[]args){
		A  x = new A();
		x.info();
        x.pro();
		System.out.println(x.toString());
		System.out.println(x.hashCode());

	}

}