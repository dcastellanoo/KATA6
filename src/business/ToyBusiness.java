package business;

import factories.ToyFactory;
import toyproducts.Toy;

public class ToyBusiness {
    final private ToyFactory toyFactory;

    public ToyBusiness(ToyFactory toyFactory) {
        this.toyFactory = toyFactory;
    }
    
    public Toy produceToy(String type){
        return this.toyFactory.produceToy(type);
    } 
}
