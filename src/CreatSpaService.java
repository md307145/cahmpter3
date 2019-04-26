import java.util.Scanner;

public class CreatSpaService {
    public static void main( String [] args) {
        Scanner k = new Scanner(System.in);
        String service;
        double price;
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        System.out.println("enter service");
        service = k.nextLine();
        System.out.println(" enter price");
        price = k.nextDouble();
        firstService.setServiceDescription(service);
        firstService.setPrice(price);
        k.nextLine();
        System.out.println(" enter service");
        service= k.nextLine();
        System.out.println(" Enter price");
        price= k.nextDouble();
        secondService.setServiceDescription(service);
        secondService.setPrice(price);
        System.out.println(" First service details:");
        System.out.println(firstService.getServiceDescription()+"$"+firstService.getPrice());
        System.out.println(" Second service detail");
        System.out.println(secondService.getServiceDescription()+ "$" + secondService.getPrice());
    }
}
