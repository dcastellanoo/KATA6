package toyproducts.models;

import toyproducts.Toy;

public class AsianCarToy implements Toy {
    private final Integer serialNumber;
    private final String type = "Asian Car";

    public AsianCarToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public Integer getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String getType() {
        return type;
    }
    
    @Override
    public void pack(){
        System.out.printf("Packing '%s' with S/N '%d'\n", this.getType(), this.getSerialNumber());
    }
    
    @Override
    public void label(){
        System.out.printf("Labeling '%s' with S/N '%d'\n", this.getType(), this.getSerialNumber());
    }

    @Override
    public String toString() {
        return "AsianCarToy{" + "serialNumber=" + serialNumber + '}';
    }
    
    
    
}
