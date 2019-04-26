import java.util.Scanner;

public class ComputerCommission {
    public static void main (String [] args){

        String vType;
        int value;
        double commRate;
        Scanner input =new Scanner(System.in);

        System.out.println(" Please enter the value of the vehicle");
        value= input.nextInt();
        System.out.println("please enter the type of the vehicle");
        vType=input.next();
        System.out.println(" Pleas enter the commission rate");
        commRate= input.nextDouble();

    }
    public static void computerCommission( int value, double rate, char vehicle){

        double commission;
        commission = value * rate;
        System.out.println("\n The "+ vehicle+ " type vehicle is worth $"+ value);

        System.out.println(" with "+ (rate * 100) +"% commission rate, the commission is $"+ commission);
    }
}
