class A {
    void pro() {
        
        if(12<13) {            
            System.out.println(x);  //---

            for(int i=0; i<3; i++) {  // i is a block level variable                

                while(i<2) {
                    System.out.println(x); //--
                    
                    int x = 9;  // x is a block level variable
                    System.out.println(x);
                    i++;
                }

                System.out.println(x); //--
            }
        }

        System.out.println(x); //---
    }
}