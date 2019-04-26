import java.util.Scanner;

public class MetricConvertion {
    public static void main(String [] args){

        double Inches;

        double Gallons;
        Scanner K =new Scanner(System.in);
        System.out.println("Enter the amount of inches you would like to convert to centimeters");
        Inches= K.nextDouble();
        System.out.println("Enter the amount of gallons ");
        Gallons = K.nextDouble();
        math( Inches,  Gallons);
    }
    public static void math( double Inches, double Gallons){
        double Centimeters= Inches*2.54;
        double litters= Gallons* 3.7854;
        System.out.println("There are "+ Centimeters+" centimeters in "+ Inches+" Inches.");
        System.out.println("There are "+ litters+" litters in "+ Gallons+" Gallons.");
    }
}
