import java.util.Scanner;
import java.io.Console;

class Result{
	public static void main(String[]args){
        Student s1 = null;
        s1= new Student();
        s1.result();
        s1= new StudentMarks();
        s1.result();
	}
}

class Student {
	final static String boardName = "\tABCD Board of Education\n";
	final static String schName = "\tABC Higher Secondary School\n";
	String stdName;
    void result(){
        Console c = System.console();
        System.out.print("Enter Student's Name: ");
        stdName= c.readLine();
        System.out.println(boardName+schName+"\nName: "+stdName);
    }
}
class StudentMarks extends Student{
    byte mth; byte eng; byte hin; byte sci; byte ssci; byte sns; 
    void result(){
        Scanner s = new Scanner(System.in);
        System.out.print("Hindi: ");
        hin = s.nextByte();
        System.out.print("English: ");
        eng = s.nextByte();
        System.out.print("Math: ");
        mth = s.nextByte();
        System.out.print("Science: ");
        sci = s.nextByte();
        System.out.print("So. Science: ");
        ssci = s.nextByte();
        System.out.print("Sanskrit: ");
        sns = s.nextByte();
    
        int sum=mth+hin+eng+sci+ssci+sns;
        float avg= (mth+hin+eng+sci+ssci+sns)/6f;
        if(avg<=33){
            System.out.println("You are Fail\nYour Total Percentage is "+avg);
        }else if(avg<=40){
            System.out.println("Congratulations...\nYou are pass with Grade D\nYour Total Percentage is "+avg);
        }else if(avg<=50){
            System.out.println("Congratulations...\nYou are pass with Grade C2\nYour Total Percentage is "+avg);
        }else if(avg<=60){
            System.out.println("Congratulations...\nYou are pass with Grade C1\nYour Total Percentage is "+avg);
        }else if(avg<=70){
            System.out.println("Congratulations...\nYou are pass with Grade B2\nYour Total Percentage is "+avg);
        }else if(avg<=80){
            System.out.println("Congratulations...\nYou are pass with Grade B1\nYour Total Percentage is "+avg);
        }else if(avg<=90){
            System.out.println("Congratulations...\nYou are pass with Grade A2\nYour Total Percentage is "+avg);
        }else{
            System.out.println("Congratulations...\nYou are pass with Grade A1\nYour Total Percentage is "+avg);
        }
    }

}