import java.lang.reflect.Method;

class Student {
    void pro() {

    }

    public void info() {

    }

    void abc() {

    }
}

class A {
    public static void main(String[] args) {
        Class klass = Student.class;

        Method[] methods = klass.getMethods();

        for(Method m : methods) {
            System.out.println(m.getName());
        }
    }
}