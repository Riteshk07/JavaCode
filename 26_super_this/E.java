class X {
	int t = 999;
    void pro(){
		int t=777;
        System.out.println(t);
	}	
}
class A extends X {
	int t =333;
    void info(){
        super.pro();
        this.pro();
        System.out.println(super.t);
        System.out.println(this.t);
    }
	public static void main(String[]args){
        new A().info();
	}
}