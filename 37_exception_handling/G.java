class A{
    public static void main (String[]args){
        System.out.println("A");
        try{
            String x = args[0];
            System.out.println(x);
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println("You are trying to reach invalid");
        }
        System.out.println("B");
    }
}