public class Debuging1 {
    public static void main(String args[])
    {
        double bill;
        double myCheck = 50.00;
        double yourCheck = 19.95;
        System.out.println("Tips are");
     bill = myCheck+yourCheck;
        calcTip( bill);
    }
    public static void calcTip(double bill)
    {
        final double RATE = 0.15;
        double tip;
        tip = bill * RATE;
        System.out.println("The tip should be at least " + tip);
    }
}

