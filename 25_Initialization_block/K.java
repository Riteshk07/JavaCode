class A {
    public static void main(String[] args) {
        System.out.println("S");
        A x = new A();
        System.out.println("K");
    }   

    A() { 
        //super();
        //variable x will be created and initialized in newly created object...
        //method pro will be linked to newly created object...
        //instance initialization block willl run over the newly created object
        System.out.println("Q"); 
    }

    int x;

    void pro() { 
        System.out.println("W"); 
    }

    {  
        System.out.println("A"); 
    }
}