import java.util.regex.Pattern;
import java.util.regex.Matcher;

class A {
	public static void main (String [] args){
		Pattern p = Pattern.compile(args[]);
		
		Matcher m = p.matcher(args[1]);
		
		if(m.matches())
			System.out.println(m.group()+" Start Index: "+m.start()+" End Index: "+m.end());
		
		
	}
}
