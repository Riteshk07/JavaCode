class A{
    private class B{
        String name;
        int age;
        B(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
    public static void main (String [] args){
        A.B t = new A().new B("raghav",23);
        System.out.println(t.name);
        System.out.println(t.age);
    }
}

// class X{
//     public static void main (String [] args){
//         A.B t = new A().new B("raghav",23);
//     }
// }