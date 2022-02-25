class Employee {
    String name;
    String id;
    byte Age;
    String shift;
    int salary;
    String location;
    String Eaddress;
    String Mobno;
    static int minAge= 18;
    void display(){System.out.println(name+", -"+id+", -"+Age+", -"+shift+", -"+salary+", -"+location+", -"+Eaddress+", -"+Mobno);}
    public static void main (String[] args){
        Employee E1= new Employee();
        E1.name= "Rajkumar";
        E1.id= "86X1234";
        E1.Age= 21;
        E1.shift= "Day";
        E1.salary= 40000;
        E1.location= "H.NO. 143 near ABC place";
        E1.Eaddress= "rajkumarabc@gmail.com";
        E1.Mobno="1234567890";
        Employee E2= new Employee();
        E2.name= "Ritesh  ";
        E2.id= "86X1235";
        E2.Age= 22;
        E2.shift= "Day";
        E2.salary= 42000;
        E2.location= "H.NO. 777 near ABC place";
        E2.Eaddress= "riteshabc@gmail.com  ";
        E2.Mobno="9876543210";
        E1.display();
        E2.display();

        
    }

}
