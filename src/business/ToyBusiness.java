package business;

import factories.SerialNumberGenerator;
import factories.ToyFactory;
import java.util.HashMap;
import java.util.Map;
import toyproducts.Toy;

public class ToyBusiness {
    final private Map<String, ToyFactory> toyFactories = new HashMap<>();
    protected final SerialNumberGenerator serialNumberGenerator 
            = new SerialNumberGenerator();


    public void add(String type, ToyFactory toyFactory) {
        this.toyFactories.put(type, toyFactory);
    }
    public Toy produceToy(String name){
        return this.toyFactories.get(name).produceToy(this.serialNumberGenerator.next());
    } 
}
