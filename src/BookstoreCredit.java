import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String [] args){
        double Gpa;
        String Name;
        Scanner k =new Scanner(System.in);
        System.out.println("Whats your name ");
        Name = k.next();
        System.out.println("What your GPA");
        Gpa =k.nextDouble();
        math( Gpa , Name);
    }
    public static void math(double Gpa, String Name){
        double Credits =Gpa*10;

        System.out.println( Name +" You have "+ Credits +" credits for the book store. Keep it up "+ Name);
    }
}
