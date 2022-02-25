package A;

abstract public class Bicycle {
	abstract public void frame();
	abstract public void breakType();
	void grips(){
		System.out.println("Grips");
	}
	public static void frameMaterial(){
        System.out.println("Steel & Iron");
    }
	void handalebar(){
	
	}
	void wheel(){
		
	}
	final public static void pedals(){
		System.out.println("Pure fix platform pedals");
	}
} 