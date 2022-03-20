class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public boolean equals(Object x) {
        
        Employee m = this;
        Employee n = (Employee)x;
        
        return m.salary == n.salary;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("ganesh", 34000);
        Employee e2 = new Employee("ganesh", 34000);

        System.out.println(e1 == e2);
        System.out.println(e1.equals(e2));
    }
}
