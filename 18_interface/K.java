// declared metthod in an interface are implicitly abstract.
// subclass is responsible for implimentation .
// if subclass fails to impliment such abstract method, then the compilation will fail.

interface X {
    void pro();
}
class A implements X{

}
// error: A is not abstract and does not override abstract method pro() in X