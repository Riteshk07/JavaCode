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
	String name ;
	int age ;
	
	static String  abc = " abcdefghijklmnopqrstuvwxyz";
	static int sum =0;
	
	
	Student (String name , int age ){
		this.name = name ;
		this.age = age;
	}
	public String toString(){
		return "Name: "+name+" -  Age: "+age;
	}
	
	public int hashCode (){
		int value = 0;
		for (int i=0; i<name.length(); i++){
			value+= abc.indexOf(name.charAt(i));
		}
		return value;
	}
	public boolean equals(Object o){
		boolean flag = false;
		if (o instanceof Student){
			Student x = this;
			Student y = (Student)o;
			System.out.println(x.name+" -- "+y.name);
			return x.name.equals(y.name) && x.age==y.age;
		}
		return flag;
	}
}
