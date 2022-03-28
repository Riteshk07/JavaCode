// char 2bytes 16bits unsigned range -> 0 ---- 65535 

class A {
    public static void main(String[] args) {
        //char x = -1; // error: incompatible types: possible lossy conversion from int to char
        // char x = 0;

        char x = 65535;
        //char x = 65536; // error: incompatible types: possible lossy conversion from int to char
        
        System.out.println(x);
    }
}