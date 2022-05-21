class A {
	
	public static void main (String[]args){
		String name = "mohan";
		Student s1 = new Student ("mohan",13);
		Student s2 = new Student ("mohan",13);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
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
