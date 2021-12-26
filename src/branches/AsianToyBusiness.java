package branches;

import business.*;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;

public class AsianToyBusiness extends ToyBusiness {
    
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
    
    private AsianCarToy createCar(){
        AsianCarToy car = new AsianCarToy(super.serialNumberGenerator.next());
        car.pack();
        car.label();
        System.out.printf("New '%s' with S/N '%d' built\n", car.getType(), car.getSerialNumber());
        return car;
    }
    
    private AsianHelicopterToy createHelicopter(){
        AsianHelicopterToy helicopter = new AsianHelicopterToy(super.serialNumberGenerator.next());
        helicopter.pack();
        helicopter.label();
        System.out.printf("New '%s' with S/N '%d' built\n", helicopter.getType(), helicopter.getSerialNumber());
        return helicopter;
    }
}
