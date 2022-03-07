import java.util.Scanner;
class A{
	int [] marksArray;
    
	void marks(){
		System.out.print("How many Subject: ");
		int len = new Scanner(System.in).nextInt();
		int sum = 0;
		marksArray= new int[len];
		for(int i=0; i<len; i++){
			System.out.print("Enter Subject "+(i+1)+" Marks: ");
			marksArray[i]= new Scanner(System.in).nextInt();
			sum = sum + marksArray[i];
		}
        for(int i=0; i<len; i++){
            System.out.println(marksArray[i]);
        }
        System.out.println("Total Marks: "+sum);
		System.out.println("Total percent: "+sum/len);
		    		
	}
	public static void main(String[]args){
		A x = new A();
		x.marks();
	}
}