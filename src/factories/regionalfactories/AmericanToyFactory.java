package factories.regionalfactories;

import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;

public class AmericanToyFactory extends ToyFactory {
    
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
        return car;
    }
    
    private AmericanHelicopterToy createHelicopter(){
        AmericanHelicopterToy helicopter = new AmericanHelicopterToy(super.serialNumberGenerator.next());
        return helicopter;
    }
}
