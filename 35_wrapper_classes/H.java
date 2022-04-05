class A {
    public static void main(String[] args) {
        // Byte x = Byte.valueOf("111");  // expected=> 7
        // Byte x = Byte.valueOf("111", 2);  
        // Byte x = Byte.valueOf("58", 8);  
        Byte x = Byte.valueOf("57", 8);  

        System.out.println(x);
    }
}

// Exception in thread "main" java.lang.NumberFormatException: For input string: "58"