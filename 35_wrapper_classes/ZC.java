class A {
    public static void main(String[] args) {
        Number x = 23;
        // Integer a = (Integer)x;
        // Short a= (Short)x;
        Byte a= (Byte)x;
        // Long a= (Long)x;
        // Float a= (Float)x;
        // Double a= (Double)x;

        System.out.println(a);


        Object y = true;
        Boolean b = (Boolean)y;
        System.out.println(b);
    }
}