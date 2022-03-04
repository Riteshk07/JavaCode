class Shape {
	int length;
	int width;
	int height;

	Shape (int length){
		this.length= length;
	}
	Shape(int length,int width){
		this.length = length;
		this.width = width;
	}
	Shape(int length, int width, int height){
		this(length,width);
		this.height = height;
	}
	public static void main (String[]args){
		Shape s = new Shape(12,78,56);
        Shape s2 = new Shape (13,15);
	
		System.out.println(s.length+ " - "+ s.width+ " - "+ s.height);	
        System.out.println(s2.length+ " - "+ s2.width);
	}
}
