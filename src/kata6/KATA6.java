package kata6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproducts.Toy;
import toyproducts.models.CarToy;
import toyproducts.models.HelicopterToy;
import toys.SerialNumberGenerator;
import toys.ToyBusiness;

public class KATA6 {
    
    public static void main(String[] args) {
       ToyBusiness toyBusiness = new ToyBusiness();
        ArrayList<Toy> toys = new ArrayList();
        
        Scanner in = new Scanner(System.in);
        String line = "";
        
        while (!"exit".equals(line)) {
            line = in.nextLine();
            switch (line){
                case "car":
                case "helicopter":
                    toys.add(toyBusiness.createToy(line));
                    break;
                case "list":
                    System.out.println("Built toys: " + toys.stream()
                        .map(c -> c.toString()).collect(Collectors.joining(", ")));
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
