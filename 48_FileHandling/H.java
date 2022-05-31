import java.io.File;

class A {
	public static void main(String[] args){
		//first
        //run without creating the folder path: abc/mno/
        
        //then
        //now create the folder path: abc/mno/ and then run

        File file = new File("abc/mno/pqr");
        System.out.println(file.mkdir());
	}
}