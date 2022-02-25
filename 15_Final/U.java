class Circle {
	int radius;
	final static float PI=3.14f;
	public static void main(String[]args){
		Circle c1 = new Circle();
		c1.radius=15;
		Circle c2= new Circle();
		c2.radius= 7;
		Circle c3 = new Circle();
		c3.radius = 12;
		Circle c4 = new Circle();
		c4.radius = 10;
		c1.display();
		c2.display();
		c3.display();
		c4.display();
	}
	void display(){
		System.out.println("perimeter of circle "+2*Circle.PI*radius);
		System.out.println("PERIMETER OF CIRCLE "+2*PI*radius);
	
	}
}