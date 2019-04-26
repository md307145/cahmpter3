import java.util.Scanner;

public class Temp {
    public static void main(String [] args){
        Scanner k= new Scanner(System.in);
        double M;
        double A;
        double N;
        System.out.println("Enter the Temperature in Fahrenheit at 8:00am ");
        M=k.nextByte();
        System.out.println("Enter the Temperature at 12:00pm");
        A=k.nextByte();
        System.out.println("Enter the Temperature at 9:00pm");
        N=k.nextByte();
        Math(M,A,N);

    }
    public static void Math(double M, double A ,double N){
        double MT=  (M-32)/1.8000;
        double AT=(A-32)/1.8000;
        double NT=(N-32)/1.800;
        System.out.println("At 8:00am the temp in is "+MT+
                "°C, at 12:00 pm the temp is "+AT+"°C, and the temp at 9:00 pm is "+NT+ "°C");


    }
}
