
import java.util.Arrays;

class A{
	public static void main (String [] args ){
		char [] x = {'t','A','a','1','0'};
		Arrays.sort(x);
		for (char t : x){
			System.out.print(t+" ");
		}
		System.out.println();
		
		System.out.println(Arrays.binarySearch(x,'a'));
		System.out.println(Arrays.binarySearch(x,'A'));
		System.out.println(Arrays.binarySearch(x,'1'));
		System.out.println(Arrays.binarySearch(x,'0'));
	}
}