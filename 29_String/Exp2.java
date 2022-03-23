class Solution {
    public String defangIPaddr(String address) {
        String [] x = new String[address.length()];
        for (int i =0; i<x.length; i++){
            if(x[i]=="."){
                x[i] = "[.]";
            }else{x[i] = (String)address.charAt(i);}
        }
        return String.valueOf(x);
    }
}
class A {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.defangIPaddr("1.1.1.1"));
    }
}