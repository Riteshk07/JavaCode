class A {
    //overridden method
    int pro() {
        return 1;
    }
}

class B extends A {
    // overriding method
    // return type of an overriding method must be the same 
    // primitive type which his declared with the overridden method... 
    int pro() {
        return 2;
    }
}