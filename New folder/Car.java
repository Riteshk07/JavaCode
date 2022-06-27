import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

class Car{
    String model;
    String type;
    int price;
    String insuranceType;

    Car(String model, String type, int price, String insuranceType){
        this.model = model;
        this.type = type;
        this.price = price;
        this.insuranceType = insuranceType;
    }
    static Scanner sc = new Scanner(System.in);
    public static void main (String [] args){
        ArrayList<Car> carList = new ArrayList<Car>();
        ArrayList<Integer> preArr = new ArrayList<Integer>();

        HashMap<String, Integer> typeMap= new HashMap<String, Integer>();
        typeMap.put("Hatchback",1);
        typeMap.put("Sedan",2);
        typeMap.put("SUV",3);

        HashMap<String, Integer> preMap = new HashMap<String, Integer>();
        preMap.put("Basic",1);
        preMap.put("Premium",2);

        String per = "y";
        int premium=0;

        while(per.equals("y")){
            
            Car c = new Car(sc.next(),sc.next(),sc.nextInt(),sc.next());
            System.out.println("----------------------------------------");
            
            if (typeMap.get(c.type)==1){
                premium = (c.price * 5)/100;
                if(preMap.get(c.insuranceType)==2){
                    premium = premium + (premium*20)/100;
                }
            }else if (typeMap.get(c.type)==2){
                premium = (c.price * 8)/100;
                System.out.println(premium);
                System.out.println(c.price);
                if(preMap.get(c.insuranceType)==2){
                    premium = premium + (premium*20)/100;
                }
            }else if (typeMap.get(c.type)==3){
                premium = (c.price * 10)/100;
                if(preMap.get(c.insuranceType)==2){
                    premium = premium + (premium*20)/100;
                }
            }
            carList.add(c);
            preArr.add(premium);

            System.out.print("Do you want to Enter details of any car? ");
            per = sc.next();
            if(per.equals("n")){
                break;
            }else if (per != "y"){
                System.out.println("Invalid Input");
                break;
            }
            premium =0;
        }
        int len = carList.size();
        for (int i=0; i<len; i++){
            Car c = carList.get(i);
            System.out.println("Car Model: "+c.model);
            System.out.println("Car price: "+c.price);
            System.out.println("Total insurance to be paid: "+ preArr.get(i));
            System.out.println("-------------------------------------------------");
        }
    }


}