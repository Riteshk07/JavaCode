import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(12);
        a1.add(15);
        a1.add(17);

        pro(a1);
    }

    static void pro(ArrayList<? extends Number> list) {
        System.out.println(list.remove(2));

        
        System.out.println(list);
    }
}