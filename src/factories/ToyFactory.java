package factories;

import toyproducts.Toy;

public abstract class ToyFactory {
    protected final SerialNumberGenerator serialNumberGenerator 
            = new SerialNumberGenerator();
    
    public Toy produceToy(String type){
        Toy toy = this.createToy(type);
        toy.pack();
        toy.label();
        System.out.printf("New '%s' with S/N '%d' built\n", toy.getType(), toy.getSerialNumber());
        return toy;
    }
    
    protected abstract Toy createToy(String type);
}
