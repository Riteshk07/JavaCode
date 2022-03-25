class A {
    public static void main(String[] args) {
        String x = "mohan";
        System.out.println(x);
        x = "om";        
        System.out.println(x);   
        //reference variable is still modifiable
        //here new string object with value om is created 
        //original string object with value mohan is still there inside the string constant pool
        //along with the string object containing om       
    }
}
