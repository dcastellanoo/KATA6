package toys;

public class Car {
    private final Integer serialNumber;
    private final String type = "Car";

    public Car(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public String getType() {
        return type;
    }
    
    
    public void pack(){
        System.out.printf("Packing '%s' with S/N '%d'\n", this.getType(), this.getSerialNumber());
    }
    
    public void label(){
        System.out.printf("Labeling '%s' with S/N '%d'\n", this.getType(), this.getSerialNumber());
    }
    
}
