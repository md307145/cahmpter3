import java.util.Scanner;

public class Debugging4 {
    public static void main(String args[])
    {
        int myCredits = 13;
        int yourCredits = 17;
        double rate = 75.84;
        double mt;
        double yt;
        Scanner k=new Scanner(System.in);
        System.out.println("My tuition:");
        mt=k.nextDouble();
        System.out.println("Your tuition:");
        yt=k.nextDouble();
        tuitionBill(mt,yt, rate);
    }
    public static void tuitionBill(double mt, double yt, double rate )
    {
        double tt;
        tt= mt+yt;
        double t;
        t=tt*rate;
        System.out.println("Total due " +t);
    }
}
