import java.util.*;
import java.util.TreeSet;
class A {
	public static void main (String [] args){
		TreeSet<Student> x = new TreeSet<Student>();
		x.add(new Student("mohan", 12));
		x.add(new Student("rohan", 14));
		x.add(new Student("gohan", 15));
		x.add(new Student("iohan", 19));
		x.add(new Student("tohan", 11));
		System.out.println(x);
		
	}
}
class Student implements Comparable{
    String name;
    int age;
    Student(String nam , int ag){
        this.name = nam;
        this.age = ag;
    }
    public int compareTo(Object obj){
        System.out.println("please enter 1 according to name"+"\n"+"please enter 2 according to age");
        
        Scanner s = new Scanner(System.in);
        int p = s.nextInt();
        int flag = 0; int m = 0;
        if(p==1){
            Student a = this;
            Student b = (Student)obj;

            String nm1 = a.name;
            String nm2 = b.name;
           if(nm1.compareTo(nm2)==0){
               flag = 1;
           }
        }else if(p==2){
            Student a = this;
            Student b = (Student)obj;
            
            int x = a.age;
            int y = b.age;
            if(x==y){
                m=1;
            }
        }
        return p==1 ? flag : m ;
    }
}