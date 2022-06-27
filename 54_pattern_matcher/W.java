import java.util.regex.Pattern;
import java.util.regex.Matcher;

class A {
	public static void main (String [] args){
		Pattern p = Pattern.compile("a.b");
		
		Matcher m = p.matcher("xa b_ 2ra#b89a9b_#4@aZb");
		
		while (m.find()){
			System.out.println(m.group()+" Start Index: "+m.start()+" End Index: "+m.end());
		}
	}
}