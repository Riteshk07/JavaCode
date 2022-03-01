class Student{
	Student(int x, float y){
		System.out.println("Hello Ji");
	}
	Student(float x , int y){
		System.out.println("suno Ji");
	}
}

class X{
	public static void main(String[]args){
		new Student(3,4.5f);
		new Student(6.5f,1);
	}
}