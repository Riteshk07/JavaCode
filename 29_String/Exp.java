class Solution {
    public String defangIPaddr(String address) {
        char [] x = new char[(address.length())+6];
        int c =0;
        for (int i =0;  i<x.length; i++){
            if(address.charAt(c)=='.'){
                x[i] = '[';
                x[i+1] = '.';
                x[i+2] = ']'; 
                i+=2;
            }
            else{   x[i] = address.charAt(c);   }
            c+=1;
        }
        return String.valueOf(x);
    }
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.defangIPaddr("1.1.1.1"));
    }
}
