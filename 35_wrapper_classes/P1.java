class A{
    public static void main (String[]args){
        // Long x = Long.valueOf(56);
        // Long x = Long.valueOf(45l);
        // Long x = Long.valueOf(9223372036854775807l);
        Long x = Long.valueOf(9223372036854775808l);    // error: integer number too large

        System.out.println(x);
    }
}