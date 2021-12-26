package factories;

import toyproducts.Toy;

public abstract class ToyFactory {
    
    public Toy produceToy(Integer serialNumber){
        Toy toy = this.createToy(serialNumber);
        toy.pack();
        toy.label();
        System.out.printf("New '%s' with S/N '%d' built\n", toy.getType(), toy.getSerialNumber());
        return toy;
    }
    
    protected abstract Toy createToy(Integer serialNumber);
}
