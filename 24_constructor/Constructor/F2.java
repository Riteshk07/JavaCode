class A {
	A(int x ){
		System.out.println("Hello JI");
	}
}

class B extends A{
    B(){
        super();
    }
}

// error: constructor A in class A cannot be applied to given types;
//         super();
//         ^
//   required: int
//   found: no arguments
//   reason: actual and formal argument lists differ in length