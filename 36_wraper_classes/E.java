class A {
    public static void main(String[] args) {
        //Case 1:
        char j = 128;
        Character x = Character.valueOf('A');
        Character y = Character.valueOf('A');
        
        //Case 2:
        // char j = 128;
        // Character x = Character.valueOf(j);
        // Character y = Character.valueOf(j);

        System.out.println(x == y);
    }
}