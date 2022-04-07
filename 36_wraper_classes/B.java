class A{
    public static void main (String[]args){
        // case 1 
        // long j = 34;
        // Long  x = Long.valueOf(j);
        // Long  y = Long.valueOf(j);

        //case 2
        long j = 129;
        Long  x = Long.valueOf(j);
        Long  y = Long.valueOf(j);

        System.out.println(x==y);
    }
}