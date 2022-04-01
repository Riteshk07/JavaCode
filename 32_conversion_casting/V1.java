class Animal { }

class Dog extends Animal { }

class Cat extends Animal { }

class X {
    public static void main(String[] args) {
        Animal x = new Cat(); //widenning conversion
        Dog y = (Dog)x;  //narrowing conversion
    }
}

// ClassCastException: class Cat cannot be cast to class Dog