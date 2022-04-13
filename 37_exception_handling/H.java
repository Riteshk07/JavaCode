class A{
    public static void main (String[]args){
        System.out.println("A");
        try{
            String x = "";
            System.out.println(x.charAt(0));
        }catch(StringIndexOutOfBoundsException a){
            System.out.println("You are trying to reach invalid");
        }
        System.out.println("B");
    }
}