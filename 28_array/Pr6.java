class A {
    public static void main (String[]args){
        int count= 0;
        char[]x = {'m','o','h','a','n',' ','i','s',' ','a',' ','g','o','o','d',' ','b','o','y'};
        char[]y= {'a','e','i','o','u'};
        for (int i = 0; i<y.length; i++){
            
            for(int j=0; j<x.length; j++){
                if (y[i]==x[j]){
                    count+=1;
                }
            }
            System.out.println(y[i]+" --> "+count);
            count=0;
        }
    }
}