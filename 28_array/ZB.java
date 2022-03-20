class A {
    public static void main(String[] args) {
        char[] x = {'m','o','h','a','n',' ','i','s',' ','a',' ','g','o','o','d',' ','b','o','y'};

        char[] y = {'a','e','i','o','u'};

        for(char t : y) {
            int count = 0;
            for(char n : x) {
                if(t == n) {
                    count++;
                }
            }

            System.out.println(t+" - "+count);
        }
    }
}