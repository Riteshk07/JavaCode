class A{
    public static void main (String[] args){
        B.age =12;
        System.out.println(B.age);
        B.pro();
        
    }

}

class B {
    static byte age;
    static void pro(){
        System.out.println("Aur Batao\nSab badiya ");
    }

}
