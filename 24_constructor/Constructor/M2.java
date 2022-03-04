class Student {
    String name = "golu";
    int age = 12;

    Student() {
        System.out.println(this.name + " ~~~");
        System.out.println(this.age + " ~~~");
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}