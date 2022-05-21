import java.util.HashMap;
import java.util.Set;

class A {
	public static void main (String [] args){
		HashMap<Student, Collage>  x = new HashMap<Student, Collage >();
		x.put(new Student("mohan", 17), new Collage("JEC"));
		x.put(new Student("sohan", 17), new Collage("GGITS"));
		x.put(new Student("mohan", 17), new Collage("GEC"));
		
		System.out.println(x);
	}
}

class Student {
	Integer age ;
	String name ;
	static String s = " abcdefghijklmnopqrstuvwxyz";
	Student (String name , Integer age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return name +" - "+age;
	} 
	
	public int hashCode (){
		int val = 0;
		int len = name.length();
		for (int i =0; i<len; i++){
			val+= s.indexOf(name.charAt(i));
		}
		return val;
	}
	public boolean equals(Object o){
		boolean flag = false;
		
		if (o instanceof Student){
			Student x = (Student)o;
			flag = this.name.equals(x.name);
		}
		return flag;
	}
}

class Collage {
	String collage;
	Collage(String collage){
		this.collage = collage ;
	}
	public String toString(){
		return collage;
	} 
	public boolean equals(Object o){
		boolean flag = false;
		
		if (o instanceof Collage){
			Collage x = (Collage)o;
			flag = this.collage.equals(x.collage);
		}
		return flag;
	}
}