class A {
    public static void main(String[] args) {
        //Case 2:
        int[][] x = {{1,2},{3,4,5}};
        // System.out.println(x instanceof int[][]);
        // System.out.println(x instanceof int[]);
        // System.out.println(x[0] instanceof int[]);
        System.out.println(x[0][0] instanceof int);
        /*
        S.java:8: error: unexpected type
        System.out.println(x[0][0] instanceof int);
                               ^
        required: reference
        found:    int
        S.java:8: error: unexpected type
                System.out.println(x[0][0] instanceof int);
                                                    ^
        required: class or array
        found:    int
        2 errors
        */


        // Case 1:
        // int[] x = {12, 13, 14};
        // System.out.println(x instanceof int[]);
    }
}