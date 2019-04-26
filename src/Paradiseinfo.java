import java.util.Scanner;

public class Paradiseinfo {
    public static void main(String [] args){
        double price;
        double discount;

        Scanner k = new Scanner(System.in);
        System.out.println("enter cutoff price for discount");
        price=k.nextDouble();
        System.out.println(" Enter discount rate as a whole number");
        discount=k.nextDouble();
        computeDiscountInfo(price, discount);
        displayIngo();

    }
    public static void displayIngo(){
        System.out.println(" Paradise Day Spa wants to pamper you.");
        System.out.println(" We will make you look good");
    }
    public static void computeDiscountInfo( double price , double discount){
        double savings;
        savings= price*discount/100;
        System.out.println(" SSpecial this week on any service over "+ price);
        System.out.println(" Discount of"+ discount+" percent");
        System.out.println(" That's a saving of at least $"+ savings);
    }
}
