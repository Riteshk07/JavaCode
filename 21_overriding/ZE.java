interface Jumpable{
	void jump();
}
class SportsCar implements Jumpable{
	public void jump(){
		System.out.println("Sports car jumping");
	}
}
class Ball implements Jumpable{
	public void jump(){
		System.out.println("Ball jumping");
	}
}
class Cat implements Jumpable{
	public void jump(){
		System.out.println("Cat jumping");
	}
}
class X {
	public static void main(String[]args){
		Jumpable j = null;
		j = new SportsCar();
		j.jump();
		j= new Ball();
		j.jump();
		j= new Cat();
		j.jump();
	}
}