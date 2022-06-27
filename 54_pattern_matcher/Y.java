import java.util.regex.Pattern;
import java.util.regex.Matcher;

class A {
	public static void main (String [] args){
		Pattern p = Pattern.compile("mohan");
		
		Matcher m = p.matcher("mohan is my best friend and mohan is good singer");
		
		m.find();
		System.out.println(m.group()+" Start Index: "+m.start()+" End Index: "+m.end());
		
		m.find();
		System.out.println(m.group()+" Start Index: "+m.start()+" End Index: "+m.end());
		
	}
}