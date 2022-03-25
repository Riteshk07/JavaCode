class A {
    public static void main(String[] args) {
        //Case 3:
        String x = "mohan is my friend";
        String y = x.substring(5,12);    
        
        //Case 2:
        /*
        String x = "ramanna";
        String y = x.replace("a","o");
        */

        //Case 1:
        /*
        String x = "mohan";
        String y = x.toUpperCase();
        */
        
        System.out.println(x==y);  //false
        System.out.println(x);     
        System.out.println(y);


        //String objects are immutable...
    }
}
