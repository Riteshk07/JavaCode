class A {
    public static void main(String[] args) {

        // Byte x = Byte.valueOf("om");
        // Byte x = Byte.valueOf("12");
        Byte x = Byte.valueOf("128");

        System.out.println(x);
    }
}

// Exception in thread "main" java.lang.NumberFormatException: For input string: "om"
// Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"128" Radix:10