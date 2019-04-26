import java.util.Scanner;

public class NumberDemo2 {
    public static void main(String [] args)
    {
        int a;
        int b;
        Scanner key= new Scanner(System.in);
        System.out.println("Please enter a whole number");
        a= key.nextInt();
        System.out.println("Please enter another whole number");
        b= key.nextInt();


        displayNumberPlusFive(a, b);
        displayTwiceTheNumber(a,b);


    }
    public static void displayTwiceTheNumber ( int a , int b){
        a =a*2;
        b=b*2;
        displayResults("Twice the number is", a);



        displayResults("Twice the number is ",b);

    }
    public static void displayNumberPlusFive( int y , int z){
        y=y+5;
        z=z+5;
        displayResults("plus 5 to the number ",y);
        displayResults("Plus 5 to the number ",z);
    }
    public static void displayNumberSquared(int c , int d){
        c=c*c;
        d=d*d;
        displayResults("Squared the number ",c);
        displayResults(" squared the number ",d);
    }
    public static void displayResults(String display, int answer){
        System.out.println(display +
                answer);
    }
}
