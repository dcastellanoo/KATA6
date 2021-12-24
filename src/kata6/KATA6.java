package kata6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.Car;
import toys.Helicopter;
import toys.SerialNumberGenerator;

public class KATA6 {
    
    public static void main(String[] args) {
        SerialNumberGenerator generator = new SerialNumberGenerator();
        ArrayList<Car> cars = new ArrayList();
        ArrayList<Helicopter> helicopters = new ArrayList();
        
        Scanner in = new Scanner(System.in);
        String line = "";
        
        while (!"exit".equals(line)) {
            line = in.nextLine();
            switch (line){
                case "car":
                    Car car = new Car(generator.next());
                    car.pack();
                    car.label();
                    cars.add(car);
                    System.out.printf("New '%s' with S/N '%d' built\n", car.getType(), car.getSerialNumber());
                    break;
                case "helicopter":
                    Helicopter helicopter = new Helicopter(generator.next());
                    helicopter.pack();
                    helicopter.label();
                    helicopters.add(helicopter);
                    System.out.printf("New '%s' with S/N '%d' built\n", helicopter.getType(), helicopter.getSerialNumber());
                    break;
                case "list":
                    System.out.println("Built cars: " + cars.stream()
                        .map(c -> c.getSerialNumber().toString()).collect(Collectors.joining(", ")));
                    System.out.println("Built helicopters: " + helicopters.stream()
                        .map(c -> c.getSerialNumber().toString()).collect(Collectors.joining(", ")));
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Command unknow!");    
            }
        }
    }    
}
