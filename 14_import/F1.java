import java.sql.Date;

class A {
    public static void main (String[]args){
        Date x = new Date(9998896985566l);   // Date starts from 1970-01-01
        System.out.println(x);
        java.util.Date y = new java.util.Date();
        System.out.println(y);
    }
}
