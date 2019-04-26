public class Debuging2 {

        public static void main (String args[])
        {
            int a = 2;
            int b = 5;
            int c = 10;
            add(a,b);
            subtract(a,b);


        }
      public static void add(int a , int b){
            System.out.println("The sum of " + a +
                    " and " + b + " is " + (a + b));
        }
        public static void subtract ( int a, int b)
        {
            System.out.println("The difference between " +
                    a + " and " + b + " is " + (a - b));
        }
    }