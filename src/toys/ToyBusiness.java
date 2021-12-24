package toys;

public class ToyBusiness {
    public final SerialNumberGenerator serialNumberGenerator 
            = new SerialNumberGenerator();
    
    public Car createCar(){
        Car car = new Car(this.serialNumberGenerator.next());
        car.pack();
        car.label();
        System.out.printf("New '%s' with S/N '%d' built\n", car.getType(), car.getSerialNumber());
        return car;
    }
    
    public Helicopter createHelicopter(){
        Helicopter helicopter = new Helicopter(this.serialNumberGenerator.next());
        helicopter.pack();
        helicopter.label();
        System.out.printf("New '%s' with S/N '%d' built\n", helicopter.getType(), helicopter.getSerialNumber());
        return helicopter;
    }
}
