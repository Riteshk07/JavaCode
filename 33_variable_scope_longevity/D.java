class A {
    void pro() {
        
        if(12<13) {
            int x = 9;  // x is a block level variable
            System.out.println(x);

            for(int i=0; i<3; i++) {  // x is a block level variable
                System.out.println(x);

                while(i<2) {
                    System.out.println(x);
                    i++;
                }
            }
        }

        System.out.println(x);
    }
}