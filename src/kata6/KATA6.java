package kata6;

import factories.regionalfactories.AsianCarToyFactory;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproducts.Toy;
import business.ToyBusiness;
import factories.regionalfactories.AmericanCarToyFactory;
import factories.regionalfactories.AmericanHelicopterToyFactory;
import factories.regionalfactories.AsianHelicopterToyFactory;

public class KATA6 {
    
    public static void main(String[] args) {
        ToyBusiness toyBusiness = new ToyBusiness();
        ArrayList<Toy> toys = new ArrayList();
        
        toyBusiness.add("american car", new AmericanCarToyFactory());
        toyBusiness.add("asian car", new AsianCarToyFactory());
        toyBusiness.add("american helicopter", new AmericanHelicopterToyFactory());
        toyBusiness.add("asian helicopter", new AsianHelicopterToyFactory());
        
        Scanner in = new Scanner(System.in);
        String line = "";
        
        while (!"exit".equals(line)) {
            line = in.nextLine();
            switch (line){
                case "american car":
                case "american helicopter":
                case "asian car":
                case "asian helicopter":
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
