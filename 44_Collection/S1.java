import java.util.HashSet;

class A {
	public static void main (String [] args){
		HashSet<Student> x = new HashSet <Student>();
		x.add(new Student("mohan", 12));
		x.add(new Student("sohan", 12));
		x.add(new Student("hanmo", 12));
		System.out.println("~~~~~~~~~~~~~~~~");
		x.add(new Student("gohan", 12));
		x.add(new Student("hamno", 12));
		System.out.println("~~~~~~~~~~~~~~~~");
		x.add(new Student("hamno", 12));
		
		System.out.println(x);
	}
}

class Student {
	String name ;
	int age;
	static String abc = " abcdefghijklmnopqrstuvwxyz";
	
	Student (String name , int age){
		this.name = name;
		this.age = age;
	}
	public String toString (){
		return name+"-"+age;
	}
	
	public boolean equals(Object o){
		boolean flag = false ;
		if(o instanceof Student){
			Student x = this ;
			Student y = (Student)o;
			System.out.println(x.name+"--"+y.name);
			
			flag = x.name.equals(y.name) && x.age==y.age;
		}
		return flag;
	}
	public int hashCode (){
		int val = 0;
		int l = name.length();
		for (int i =0; i<l; i++){
			val += abc.indexOf(name.charAt(i));
		}
		return val;
	}
} 