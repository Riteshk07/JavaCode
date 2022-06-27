import java.util.regex.Pattern;
import java.util.regex.Matcher;

class A {
	public static void main (String [] args){
		Pattern p = Pattern.compile(".*?xx");
		
		Matcher m = p.matcher("xa b_xx 2ra#b8xx9a9b_#4xx@aZb");
		
		while (m.find()){
			System.out.println(m.group()+" Start Index: "+m.start()+" End Index: "+m.end());
		}
	}
}