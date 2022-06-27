class A {
	class H{
		void pro(){
			
		}
		
		final static void info(){
			
		}
	}
}

/*
 error: Illegal static declaration in inner class A.H
                final static void info(){
                                  ^
  modifier 'static' is only allowed in constant variable declarations
*/