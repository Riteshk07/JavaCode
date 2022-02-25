class X {

    //compiler won't provide constructor if developer created his/her own constructor...

    X(int a) {

    }

    public static void main(String[] args) {
        // new X();

        new X(12);
    }
}