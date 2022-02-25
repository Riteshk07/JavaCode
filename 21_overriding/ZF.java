interface Jumpable{
	void jump();
}
class SportsCar implements Jumpable{
	public void jump(){
		System.out.println("SportsCar jumping");
	}
}
class Ball implements Jumpable{
	public void jump(){
		System.out.println("Balljumping");
	}
}
class Cat implements Jumpable{
	public void jump(){
		System.out.println("Catjumping");
	}
}
class X {
	public static void main(String[]args){
		createJumpable();
	}

	static Jumpable createJumpable(){
		Jumpable j = null;
		j = new SportsCar();
		j.jump();
		j= new Ball();
		j.jump();
		j= new Cat();
		j.jump();
        return j;
	}
}