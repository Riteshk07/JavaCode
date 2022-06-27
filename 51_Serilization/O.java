class O{
	transient int y;
	transient static float z=23;
	
	void pro(){
		transient char a = "A";
		// error: illegal start of expression
	}
}