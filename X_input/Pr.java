class A {
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

    public static void main(String[] args) {
        char [] x = pro("ccbbaa");
        char [] y = pro("CcBbAa");
    
    }
}