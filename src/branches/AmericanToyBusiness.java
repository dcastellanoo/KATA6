package branches;

import business.*;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;

public class AmericanToyBusiness extends ToyBusiness {
    
    @Override
    public Toy createToy(String type){
       switch(type) {
           case "car":
               return this.createCar();
           case "helicopter":
               return this.createHelicopter();
           default:
               return null;  
       } 
    }
    
    private AmericanCarToy createCar(){
        AmericanCarToy car = new AmericanCarToy(super.serialNumberGenerator.next());
        car.pack();
        car.label();
        System.out.printf("New '%s' with S/N '%d' built\n", car.getType(), car.getSerialNumber());
        return car;
    }
    
    private AmericanHelicopterToy createHelicopter(){
        AmericanHelicopterToy helicopter = new AmericanHelicopterToy(super.serialNumberGenerator.next());
        helicopter.pack();
        helicopter.label();
        System.out.printf("New '%s' with S/N '%d' built\n", helicopter.getType(), helicopter.getSerialNumber());
        return helicopter;
    }
}
