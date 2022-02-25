class A {
    Animal pro() {
        return null;
    }
}

class B extends A {
    //overriding method
    // return type can be a sub type of return type declared with the overridden method 
    Dog pro() {
        return null;
    }
}

class Animal { }

class Dog extends Animal {  }


// Animal x = null;