package toys;

import toyproducts.Toy;
import toyproducts.models.CarToy;
import toyproducts.models.HelicopterToy;

public class ToyBusiness {
    public final SerialNumberGenerator serialNumberGenerator 
            = new SerialNumberGenerator();
    
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
    
    private CarToy createCar(){
        CarToy car = new CarToy(this.serialNumberGenerator.next());
        car.pack();
        car.label();
        System.out.printf("New '%s' with S/N '%d' built\n", car.getType(), car.getSerialNumber());
        return car;
    }
    
    private HelicopterToy createHelicopter(){
        HelicopterToy helicopter = new HelicopterToy(this.serialNumberGenerator.next());
        helicopter.pack();
        helicopter.label();
        System.out.printf("New '%s' with S/N '%d' built\n", helicopter.getType(), helicopter.getSerialNumber());
        return helicopter;
    }
}
