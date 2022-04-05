class A {
    public static void main (String[]args){
        int count= 0;
        char[]x = {'m','o','h','a','n',' ','i','s',' ','a',' ','g','o','o','d',' ','b','o','y'};
        for (int i = 0; i<x.length; i++){
            
            for(int j=0; j<x.length; j++){
                if (x[i]==x[j]){
                    count+=1;
                }
                
            }
            System.out.println(x[i]+" --> "+count);
            count=0;
        }
    }
}