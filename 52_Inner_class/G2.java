class A{
	class G{
		int y =89;
		
		static float t = 45.12f;
	}
}

/*
Illegal static declaration in inner class A.G
                static float t = 45.12f;
                             ^
  modifier 'static' is only allowed in constant variable declarations
*/