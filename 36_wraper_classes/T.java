class A {
    public static void main(String[] args) {
        Integer w = 34;

        Number t = incrementFunc(w);

        System.out.println(t);
    }

    static Number incrementFunc(Number obj) {
        Number x = null;

        if(obj instanceof Byte) {
            byte tmp = obj.byteValue();
            tmp++;
            x = Byte.valueOf(tmp);
        } else if(obj instanceof Short) {
            short tmp = obj.shortValue();
            tmp++;
            x = Short.valueOf(tmp);
        } else if(obj instanceof Integer) {
            int tmp = obj.intValue();
            tmp++;
            x = Integer.valueOf(tmp);
        } else if(obj instanceof Long) {
            long tmp = obj.longValue();
            tmp++;
            x = Long.valueOf(tmp);
        } else if(obj instanceof Float) {
            float tmp = obj.floatValue();
            tmp++;
            x = Float.valueOf(tmp);
        } else {
            double tmp = obj.doubleValue();
            tmp++;
            x = Double.valueOf(tmp);
        }

        return x;
    }
}