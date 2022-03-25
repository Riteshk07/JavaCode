class A {
	public static void main (String []args){
		System.out.println("mohan".concat(" kumar"));
		System.out.println("mohan".concat(" kumar"," vishwas"));
        /*error: method concat in class String cannot be applied to given types;
                        System.out.println("mohan".concat(" kumar"," vishwas"));
                                                  ^
            quired: String
            und: String,String
            ason: actual and formal argument lists differ in length*/
	}
}
