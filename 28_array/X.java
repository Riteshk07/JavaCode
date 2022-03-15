import java.util.Scanner;

class A {
    public static void main(String[] args) {
        int[] x = {12, 45, 78, 34, 55, 21, 12, 9, 23, 78, 120, 69, 12, 45};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int value = sc.nextInt();

        int count = 0;

        for(int y : x) {
            if(y == value) {
                count++;
            }
        }

        System.out.println(count+" records found...");
    }
}