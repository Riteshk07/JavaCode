import java.util.HashSet;

class A{
	public static void main (String [] args){
		HashSet x = new HashSet();
		
		x.add(new Student ("mohan", 12));
		x.add(new Student ("tohan", 13));
		x.add(new Student ("sohan", 15));
		x.add(new Student ("tohan", 19));
		x.add(new Student ("rohan", 18));
		
		Student w= new Student ("rohan", 18); 
		System.out.println(x);
		System.out.println(x.remove(w));
		System.out.println(x);
	}
}

class Student {
	String name;
	int age;
	Student (String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return "Name: "+name+" -  Age: "+age;
	}
}