package kata6;

import factories.regionalfactories.AsianToyFactory;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproducts.Toy;
import business.ToyBusiness;
import factories.regionalfactories.AmericanToyFactory;

public class KATA6 {
    
    public static void main(String[] args) {
        AmericanToyFactory americanToyFactory = new AmericanToyFactory();
        AsianToyFactory asianToyFactory = new AsianToyFactory();
        ToyBusiness toyBusiness = new ToyBusiness(asianToyFactory);
        ArrayList<Toy> toys = new ArrayList();
        
        Scanner in = new Scanner(System.in);
        String line = "";
        
        while (!"exit".equals(line)) {
            line = in.nextLine();
            switch (line){
                case "car":
                case "helicopter":
                    toys.add(toyBusiness.produceToy(line));
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
