// char	 -->2 byte  --> 0 to 65,535 (unsigned)
// byte	 -->1 byte  --> -128 to 127
// short -->2 bytes --> -32,768 to 32,767

class A{
    public static void main(String[] args) {
        // short a = 32767;
        // short a = 32770;     // error: incompatible types: possible lossy conversion from int to short 
        // short a = (short)32770;
        short a = (short)-32770;
        System.out.println((int)a);
    }
}