class A {}

class X extends A {
    X(){
        super(1);
    }
}


// error: constructor A in class A cannot be applied to given types;
//         super(1);
//         ^
//   required: no arguments
//   found: int
//   reason: actual and formal argument lists differ in length