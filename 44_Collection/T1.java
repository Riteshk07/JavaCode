import java.util.HashSet;

class A {
	public static void main (String [] args){
		HashSet<Student> x = new HashSet <Student>();
		x.add(new Student("mohan", 21));
		x.add(new Student("sohan", 16));
		x.add(new Student("hanmo", 13));
		System.out.println("~~~~~~~~~~~~~~~~");
		x.add(new Student("gohan", 11));
		x.add(new Student("hamno", 12));
		System.out.println("~~~~~~~~~~~~~~~~");
		x.add(new Student("hamno", 12));
		
		System.out.println(x);
		System.out.println(x.remove(new Student("hamno", 12)));
		System.out.println(x.remove(new Student("gohan", 11)));
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
			val += (abc.indexOf(name.charAt(i)))*(i+1);
		}
		return val+age;
	}
} 