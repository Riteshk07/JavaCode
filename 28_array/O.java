class A {
    public static void main (String[]args){
	    Student [][]x = new Student[2][];
    
	    x[0]= new Student[]{
                new Student("om",12, new Address (new City("jabalpur"),new State("MP"))),
	    		new Student("om",12, new Address (new City("jabalpur"),new State("MP"))),
	    		new Student("om",12, new Address (new City("jabalpur"),new State("MP")))};
	    x[1] = new Student[] {
                new Student("om3",14,new Address(new City("nag"),new State("MH"))),
                new Student("om4",15,new Address(new City("Kan"),new State("UP"))),
                new Student("om5",16,new Address(new City("Ahm"),new State("GJ")))};

        System.out.println(x[1][1].address.state.stateName);
    }
}


class Student{
	String name ; 
	int age;
	Address address;

	Student (String name, int age, Address address ){
		this.name = name ;
		this.age = age;
		this.address = address;
	} 
}

class Address {
	City city;
	State state;
	
	Address (City city, State state){
		this.city = city;
		this.state = state;
	}
}

class City{
	String cityName;
	City(String cityName){
		this.cityName = cityName;
	}
}

class State {
	String stateName;

	State(String stateName){
		this.stateName = stateName;
	}
}