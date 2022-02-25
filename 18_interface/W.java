interface D { }
interface E { }

class B { }

class C { }

// class A extends B { }      // OK

// class A extends B,C { }    // NOT OK

// class A extends D { }         // NOT OK 
// class A extends D, E { }         // NOT OK

// class A implements B { }       // NOT OK
// class A implements B, C { }       // NOT OK

// class A implements D { }     // OK
class A implements D, E { }     // OK