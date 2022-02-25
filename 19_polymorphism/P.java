interface Jumpable {}

class SportsCar implements Jumpable{}

class Ball implements Jumpable{}

class Rabbit implements Jumpable{}

class A{
	public static void main (String[]args){
		SportsCar scar = new SportsCar();
		Ball ball = new Ball();
		Rabbit rabbit = new Rabbit();

        A.handleJumpable(rabbit);
        A.handleJumpable(ball);
        A.handleJumpable(scar);
	}
    static void handleJumpable(Jumpable jumpable){
		System.out.println(jumpable);
	}
}