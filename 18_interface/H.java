// variable declared inside an interface are static .

interface X{
    int a= 340;
}

class A  {
    public static void main (String[]args ){
        System.out.println(X.a);
        X.a = 78;       // error: cannot assign a value to final variable
    }
}