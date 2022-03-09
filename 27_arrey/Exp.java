import java.util.Scanner;
import java.io.Console;
class A{
	int [] marksArray;
    
	void marks(){
		System.out.print("How many Student in your class : ");
		int Slen = new Scanner(System.in).nextInt();

		System.out.print("How many Subject: ");
		int len = new Scanner(System.in).nextInt();

		String [] subName = new String[len];
		marksArray= new int[len];
		
		for (int x=0; x<Slen; x++){
			int sum = 0;
			System.out.print("Enter Student Name: ");
			String name = System.console().readLine();
			for(int i=0; i<len; i++){
				System.out.print("Enter Subject Name: ");
				subName[i] = new Scanner(System.in).next();
				System.out.print("Enter "+subName[i]+" Marks: ");
				marksArray[i]= new Scanner(System.in).nextInt();
				sum = sum + marksArray[i];
			}
        	for(int m:marksArray){
        	    System.out.println(m);
        	}
        	System.out.println("Total Marks: "+sum);
			System.out.println("Total percent: "+sum/len); 
			System.out.println("\n");
		}
		   		
	}
	public static void main(String[]args){
		A x = new A();
		x.marks();
	}
}