class A{
    public static void main (String[]args){
        // Long x = Long.valueOf("56");
        // Long x = Long.valueOf("45L");   //java.lang.NumberFormatException: For input string: "45L"
        // Long x = Long.valueOf("9223372036854775807");
        // Long x = Long.valueOf("9223372036854775808l");    // java.lang.NumberFormatException: For input string: "9223372036854775808l"
        Long x = Long.valueOf("9223372036854775808");    // java.lang.NumberFormatException: For input string: "9223372036854775808"

        System.out.println(x);
    }
}