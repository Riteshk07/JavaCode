class Animal { }

class Cat extends Animal{ }

class Bus { }

class A {
    public static void main(String[] args) {
        Animal x = (Animal)new Bus();
    }
}

// error: incompatible types: Bus cannot be converted to Animal