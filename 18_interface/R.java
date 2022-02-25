interface X {
	void pro();
	void info();
}

class A implements X {
	public void info(){

	} 
    // error: A is not abstract and does not override abstract method pro() in X
}