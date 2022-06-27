class A {
    static float[] pro(float ...x){
        return x ;
    }
    public static void main (String []args){
        float [] arr = pro(12/3,45/8,12/5,89/5);

        for(float t : arr){
            System.out.println(t);
        }
    }
}