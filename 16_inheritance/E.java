/*MULTILEVEL INHERITANCE*/
class Animal{
    
}
class Dog extends Animal{
    void pro1(){
        System.out.println();
    }
}
class Bdog extends Dog {
    void pro2(){
        System.out.println();
    }
}
class Cat extends Animal{

}
class A {
    public static void main(String[]args){
        Bdog x = new Bdog();
        System.out.println(x instanceof Bdog);
        System.out.println(x instanceof Dog );
        System.out.println(x instanceof Animal);
        System.out.println(x instanceof Object);
    }
}