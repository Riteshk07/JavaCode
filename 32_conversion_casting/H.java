// char	 -->2 byte  --> 0 to 65,535 (unsigned)
// byte	 -->1 byte  --> -128 to 127
// short -->2 bytes --> -32,768 to 32,767

class A{
    public static void main(String[] args) {
        // char a = 65535;
        // char a = 65540;     // error: incompatible types: possible lossy conversion from int to char
        // char a = (char)65540;
        char a = (char)-65540;
        System.out.println((int)a);
    }
}