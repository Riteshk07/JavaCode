class Student {
	String name ;
	int age;
	
	Student (String name , int age){
		this.name= name;
		this.age=age;
	}
	public String toString(){
		return "Name: "+this.name+"  Age: "+this.age;
	}
	public boolean equals(Object o){
		Student x = this;
		Student y = (Student)o;
		return x.name==y.name && x.age==y.age; 
	}
	public static void main (String [] args){
		Student a = new Student ("om", 12);
		Student b = new Student ("om", 12);
		System.out.println(a.equals(b));
		System.out.println(a==b);
	}
	
}