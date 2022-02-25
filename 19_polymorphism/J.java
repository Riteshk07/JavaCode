class A{}

class G extends A{}

class B extends A{}

class C extends B{}

class E extends B{}

class X{
	public static void main (String[]args){
		Object x = new C();
		System.out.println("condition--> Object x = new C();");
		System.out.println("if, x instanceof B");
		if(x instanceof B){		
			System.out.println("C-obj IS-A B");
		}else {System.out.println("C-obj IS-NOT-A B");}
		
		System.out.println("if, x instanceof C");
		if(x instanceof C){		
			System.out.println("C-obj IS-A C");
		}else {System.out.println("C-obj IS-NOT-A C");}
		
		System.out.println("if, x instanceof G");
		if(x instanceof G){		
			System.out.println("C-obj IS-A G");
		}else {System.out.println("C-obj IS-NOT-A G");}
		
		A y = new C();
		System.out.println("\ncondition--> A y = new C();");
		System.out.println("if, y instanceof Object");
		if(y instanceof Object){		
			System.out.println("C-obj IS-A Object");
		}else {System.out.println("C-obj IS-NOT-A Object");}
		
		System.out.println("if, y instanceof A");
		if(y instanceof A){		
			System.out.println("C-obj IS-A A");
		}else {System.out.println("C-obj IS-NOT-A A");}
		
		System.out.println("if, y instanceof B");
		if(y instanceof B){		
			System.out.println("C-obj IS-A B");
		}else {System.out.println("C-obj IS-NOT-A B");}
		
		System.out.println("if, y instanceof C");
		if(y instanceof C){		
			System.out.println("C-obj IS-A C");
		}else {System.out.println("C-obj IS-NOT-A C");}
		
		System.out.println("if, y instanceof G");
		if(y instanceof G){		
			System.out.println("C-obj IS-A G");
		}else {System.out.println("C-obj IS-NOT-A G");}
		
		System.out.println("if, y instanceof E");
		if(y instanceof E){		
			System.out.println("C-obj IS-A E");
		}else {System.out.println("C-obj IS-NOT-A E");}

        	B z = new C();
		System.out.println("\nCondition--> B z = new C();");
		System.out.println("if, z instanceof Object");
		if(z instanceof Object){		
			System.out.println("C-obj IS-A Object");
		}else {System.out.println("C-obj IS-NOT-A Object");}
		
		System.out.println("if, z instanceof A");
		if(z instanceof A){		
			System.out.println("C-obj IS-A A");
		}else {System.out.println("C-obj IS-NOT-A A");}
		
		System.out.println("if, z instanceof B");
		if(z instanceof B){		
			System.out.println("C-obj IS-A B");
		}else {System.out.println("C-obj IS-NOT-A B");}
		
		System.out.println("if, z instanceof C");
		if(z instanceof C){		
			System.out.println("C-obj IS-A C");
		}else {System.out.println("C-obj IS-NOT-A C");}
		
		System.out.println("if, z instanceof G");
		// if(z instanceof G){		//error: incompatible types: B cannot be converted to G
		// 	System.out.println("C-obj IS-A G");
		// }else {System.out.println("C-obj IS-NOT-A G");}
		System.out.println("Error-cannot be converted to G");

		System.out.println("if, z instanceof E");
		if(z instanceof E){		
			System.out.println("C-obj IS-A E");
		}else {System.out.println("C-obj IS-NOT-A E");}
		
	}
} 