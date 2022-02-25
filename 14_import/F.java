import java.sql.Date;
import java.util.Date;       // you can only use one import statement of Date class 

class A {
    public static void main (String []args){
        Date date = new Date(786167991);    // I want to use java.sql.Date 
        System.out.println(date);
        Date dt = new Date();          // I want to use java.util.Date
        System.out.println(dt);
    }
}
