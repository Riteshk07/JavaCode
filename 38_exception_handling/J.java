import java.io.IOException;
class A{
	public static void main (String[]args){
		try{
			
		}
		// case 3 
		catch(Object e ){
			//  error: incompatible types: Object cannot be converted to Throwable
		}
		// case 5 
		//catch(Error e ){
			
		//}
		// case 4 
		//catch(Throwable e ){
			
		//}
		// case 3 
		//catch(Exception e ){
			
		//}
		// case 2 
		// catch(IOException e ){
			//  error: exception IOException is never thrown in body of corresponding try statement
		// }
		// case 1 
		//catch(ArithmeticException e ){
			
		//}
	}
}