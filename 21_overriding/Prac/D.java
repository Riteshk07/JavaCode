interface I{
    void pro();
}
class A implements I {
	public void pro(){System.out.println("Ritesh ");}
}

class G extends A{
	public void pro(){System.out.println("\tis");}
}

class B extends A{
	public void pro(){System.out.println("\t\tA");}
}

class C extends B{
	public void pro(){System.out.println("\t\t\tGood");}
}
class D extends C{
    public void pro(){System.out.println("\t\t\t\tProgrammer");}
}

class Y{
    	I proX(int n){
        	I x = null;
        	if(n==1){x= new A();
        	}else if (n==2){x= new G();
        	}else if (n==3){x= new B();
        	}else if (n==4){x= new C();
        	}else{x= new D();}
        	return x;
    	}
}
class X{
	public static void main (String[]args){
		Y r = new Y();
        	I y = null;
        	y = r.proX(1);
        	y.pro();
        	y = r.proX(2);
        	y.pro();
        	y = r.proX(3);
        	y.pro();
        	y = r.proX(4);
        	y.pro();
        	y = r.proX(5);
        	y.pro();
    	}
} 