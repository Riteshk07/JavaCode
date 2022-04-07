class A{
    public static void main (String[]args){
        // case 1 
        // short j = 34;
        // Short  x = Short.valueOf(j);
        // Short  y = Short.valueOf(j);

        //case 2
        short j = 129;
        Short  x = Short.valueOf(j);
        Short  y = Short.valueOf(j);
        System.out.println(x==y);
    }
}