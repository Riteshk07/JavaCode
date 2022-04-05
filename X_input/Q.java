import java.util.Scanner;

class Solution {

    static boolean isAnagram(String a, String b) {
        String y = a.toUpperCase();
        String z = b.toUpperCase();
        boolean ans = true;
        for (int i = 0; i<y.length(); i++){
            int countY =0;
            int countZ =0;
            for(int j=0; j<z.length(); j++){
                if (y.charAt(i)==y.charAt(j)){
                    countY+=1;
                }
                
                if (y.charAt(i)==z.charAt(j)){
                    countZ+=1;
                }
            }
            System.out.println(countY);
            System.out.println(countY+" - "+countZ);
            if (countY!=countZ){
                ans=false;
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