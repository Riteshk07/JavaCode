class A {
    public static void main(String[] args) {
        String s = "om is my friend and he is a singer and he is a cricketer";

        System.out.println(s.lastIndexOf("is"));   // 42
        System.out.println(s.lastIndexOf("is", 41));  //  23
        System.out.println(s.lastIndexOf("is", 22));  // 3
    }
}
