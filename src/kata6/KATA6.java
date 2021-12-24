package kata6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.Car;
import toys.SerialNumberGenerator;

public class KATA6 {
    
    public static void main(String[] args) {
        SerialNumberGenerator generator = new SerialNumberGenerator();
        ArrayList<Car> cars = new ArrayList();
        
        Scanner in = new Scanner(System.in);
        String line = "";
        
        while (!line.equals("exit")) {
            line = in.nextLine();
            if (line.equals("list")){
                System.out.println("Built cars: " + cars.stream()
                        .map(c -> c.getSerialNumber().toString()).collect(Collectors.joining(", ")));
            } else if (!line.equals("exit")) {
                Car car = new Car(generator.next());
                car.pack();
                car.label();
                cars.add(car);
                System.out.println("New car S/N: " + car.getSerialNumber());
            }
        }
    }
    
}
