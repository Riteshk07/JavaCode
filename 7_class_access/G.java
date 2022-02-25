// B is now parent class of class A
// class A is now Child class of class B
class A extends B{
    public static void main (String[] args){
        A x = new A();
        System.out.println(x.age);
        x.pro();
        
    }

}

class B {
    byte age=23;
    void pro(){
        System.out.println("Aur Batao\nSab badiya ");
    }

}
