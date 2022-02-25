class A { }

class B { }

// interface D extends A { }   // NOT OK
// interface D extends A, B { }   // NOT OK

// interface D extends E { }   // OK
// interface D extends E, F { }   // OK

// interface D implements A { }   // NOT OK
// interface D implements A, B { }   // NOT OK
// interface D implements E { }   // NOT OK
interface D implements E, F { }   // NOT OK

interface E { }

interface F { }