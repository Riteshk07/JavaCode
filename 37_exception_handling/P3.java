//input: kuch-nahi, 0, 1, 2, 3, 4, a1

class A {
    
    public static void main(String[] args) {
        System.out.println(1);

        try {
            System.out.println(2);
            int i = Integer.parseInt(args[0]); 

            System.out.println(3);
            String[] x = {"golu", "simba", null, "raju"};

            System.out.println(4);
            System.out.println(x[i].length() + "~");

            System.out.println(5);
            int y = 12 / i;

            System.out.println(6);
            // System.out.println("---- Essential Code ... ------");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("AIOOBE");
            //System.out.println("---- Essential Code ... ------");
        } catch(NumberFormatException e) {
            System.out.println("NFE");
            //System.out.println("---- Essential Code ... ------");
        } /*catch(NullPointerException e) {
            System.out.println("NPE");
            //System.out.println("---- Essential Code ... ------");
        } */ catch(ArithmeticException e) {
            System.out.println("AE");
            //System.out.println("---- Essential Code ... ------");
        } finally {
            System.out.println("-- ### -- Essential Code ... --- ### ---");
        }

        // System.out.println("---- Essential Code ... ------");

        System.out.println(7);
    }
}