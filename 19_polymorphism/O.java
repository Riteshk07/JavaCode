interface Jumpable {}

class SportsCar implements Jumpable{}

class Ball implements Jumpable{}

class Rabbit implements Jumpable{}

class A{
	public static void main (String[]args){
		SportsCar scar = new SportsCar();
		Ball ball = new Ball();
		Rabbit rabbit = new Rabbit();
		
		A.handleJumpable();
        A.handleJumpable(rabbit);
        A.handleJumpable(ball);
        A.handleJumpable(scar);

		
	}
    static void handleJumpable(){
		System.out.println();
	}
	static void handleJumpable(Rabbit rabbit){
		System.out.println(rabbit);
	}
	static void handleJumpable(Ball ball){
		System.out.println(ball);
	}
	static void handleJumpable(SportsCar scar){
		System.out.println(scar);
	}
}