class A  {
	void pro(){System.out.println("Ritesh ");}
}

class G extends A{
	void pro(){System.out.println("\tis");}
}

class B extends A{
	void pro(){System.out.println("\t\tA");}
}

class C extends B{
	void pro(){System.out.println("\t\t\tGood");}
}
class D extends C{
    void pro(){System.out.println("\t\t\t\tProgrammer");}
}

class Y{
    A proX(int n){
        A x = null;
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
        A y = null;
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