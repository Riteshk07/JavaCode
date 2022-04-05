import java.util.Scanner;

class Solution {
    static char[] pro(String Str){
        Str = Str.toUpperCase();
        boolean m = true;
        char [] n = Str.toCharArray();
        while (m){
            m=false;
            for(int i=0; i<(n.length-1); i++){
                if (n[i]> n[i+1]){
                    m=true;
                    char t = n[i];
                    n[i] = n[i+1];
                    n[i+1] = t;
                }
            }
        } 
        return n;
    }

    static boolean isAnagram(String a, String b) {
        if (a.length()!=b.length()){
            return false;
        }
        char[]x=pro(a);
        char[]y = pro(b);
        boolean ans = true;
        for(int i =0; i<a.length(); i++){
            if (x[i]!=y[i]){
                ans = false;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        System.out.println(isAnagram(a, b));
    }
}