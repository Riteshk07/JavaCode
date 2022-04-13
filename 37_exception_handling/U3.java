class A{
	public static void main (String []args) throws ClassNotFoundException{
		Class kls = Class.forName("a1.a2.a3.W");

		System.out.println("Hello JI");
	}
}
/*
Exception in thread "main" java.lang.ClassNotFoundException: a1.a2.a3.W
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:581)
        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:178)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
        at java.base/java.lang.Class.forName0(Native Method)
        at java.base/java.lang.Class.forName(Class.java:315)
        at A.main(U3.java:3)

*/
