import java.util.Scanner;

public class Percentages {
    public static void main(String[] args){
        double a;
        double b;

        Scanner k=new Scanner(System.in);

        System.out.println("Enter a number");
        a= k.nextDouble();
        System.out.println("Enter a number to divide the first one by");
        b= k.nextDouble();
        computePercent(a , b);
    }
    public static void computePercent(double a , double b){
        double percent=(a/b)*100;
        System.out.println(a+" is "+ percent +" percent of "+b);}
}
