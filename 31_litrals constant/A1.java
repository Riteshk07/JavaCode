class A{
	public static void main(String[]args){
        try{
            int t = 200;
		    String s = "Good Night Friends...\rSorry                \rGood Morning Friends...";
		    for (int i =0; i<21; i++){
		    	System.out.print(s.charAt(i));
                Thread.sleep(t);
		    }
            for (int i =21; i<42; i++){
                System.out.print(s.charAt(i));
            }
            Thread.sleep(1000);
            for (int i =42; i<s.length(); i++){
		    	System.out.print(s.charAt(i));
                Thread.sleep(t);
		    }
        }catch(InterruptedException i){
            i.printStackTrace();
        }
	}
}