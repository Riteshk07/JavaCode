class A {
	static String  abc = " abcdefghijklmnopqrstuvwxyz";
	static int sum =0;
	public static void main (String[]args){
		String name = "mohan";
		Student s = new Student ("mohan",13);
		
		for (int i=0; i<name.length(); i++){
			sum+= abc.indexOf(name.charAt(i));
		}
		System.out.println(sum);
	}
}

class Student {
	String name ;
	int age ;
	
	
	Student (String name , int age ){
		this.name = name ;
		this.age = age;
	}
	public String toString(){
		return "Name: "+name+" -  Age: "+age;
	}
	
	public int hashCode (){
		int value = 0;
		return 0;
	}
}
