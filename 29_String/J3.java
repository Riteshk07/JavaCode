class Student {
	String name;
	int age;

	Student (String name, int age){
		this.name = name;
		this.age = age;
	}

	public boolean equals (Object obj){
		Student m = this ;
		Student n = (Student)obj;
		return m.name.equals(n.name) || m.age==n.age ;
	}
	public static void main (String[]args){
		Student  s1 = new Student ("om",21);
		Student  s2 = new Student ("om",21);

		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
}