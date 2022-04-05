class A {
    public static void main(String[] args) {
        Number x = 23;
        Integer a = (Integer)x;

        x = (short)253;
        Short b= (Short)x;

        x = (byte)2;
        Byte c= (Byte)x;

        x = 2345l;
        Long d= (Long)x;

        x = 23.45f;
        Float e= (Float)x;

        x = 25.45;
        Double f= (Double)x;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);


        Object y = true;
        Boolean g = (Boolean)y;
        System.out.println(g);
    }
}