import java.io.Console;

interface Jumpable{
	void jump();
}
class SportsCar implements Jumpable{
	public void jump(){
		System.out.println("SportsCar Jumping");
	}
}
class Ball implements Jumpable{
	public void jump(){
		System.out.println("Ball Jumping");
	}
}
class X {
	public static void main (String[]args){
		System.out.println("Enter 1 for SportsCar or 2 for Ball");
		byte N = Byte.parseByte(System.console().readLine());
		createJumpable(N);
	}
	static Jumpable createJumpable(int n){
		Jumpable j = null;
		if (n==1){j=new SportsCar();
		}else if (n==2){j=new Ball();
		}else{
			System.out.println("Invalid Input");
		}
		j.jump();
		return j;
	}
}
