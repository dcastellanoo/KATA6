package factories.regionalfactories;

import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;

public class AsianToyFactory extends ToyFactory {
    
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
        return car;
    }
    
    private AsianHelicopterToy createHelicopter(){
        AsianHelicopterToy helicopter = new AsianHelicopterToy(super.serialNumberGenerator.next());
        return helicopter;
    }
}
