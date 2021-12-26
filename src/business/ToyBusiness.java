package business;

import toyproducts.Toy;

public abstract class ToyBusiness {
    protected final SerialNumberGenerator serialNumberGenerator 
            = new SerialNumberGenerator();
    
    abstract public Toy createToy(String type);
    
}
