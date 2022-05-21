class A {
	public static void main (String [] args){
		Student x = new Student("mohan", 12);
		Student y = new Student("mohan", 12);
		Student z = new Student("rohan", 13);
		
		System.out.println(x.compareTo(y));
		System.out.println(y.compareTo(z));
		System.out.println(z.compareTo(x));
	}
}

class Student implements Comparable{
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
	public int compareTo(Object o){
		int value = 0;
		Student s = (Student)o;
		value = this.name.compareTo(s.name);
		return value;
	}
} 