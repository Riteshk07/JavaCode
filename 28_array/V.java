class A {
    public static void main(String[] args) {
        String[][][] x = new String[2][3][2];

        for(String[][] m : x) {
            for(String[] n : m) {
                for(String o : n) {
                    System.out.print(o+" ");
                }
                System.out.print(" - ");
            }

            System.out.println();
        }
    }
}