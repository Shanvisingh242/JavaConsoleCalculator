import java.util.Scanner;

public class Calculator
{
    static int add(int a,int b)
    {
        return a+b;
    }
    static int subtract(int a,int b)
    {
        return a-b;
    }
    static int multiply(int a,int b)
    {
        return a*b;
    }
    static double division(int a,int b)
    {
       if(b==0)
       {
           System.out.println(" Cannot divided by 0. ");
           return 0;
       }
       return (double) a/b;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n ----Menu----");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice:");
            choice = in.nextInt();
            if (choice >= 1 && choice <= 4) {
                System.out.println("Enter the first number");
                int a = in.nextInt();
                System.out.println("Enter the second number");
                int b = in.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Addition = " + add(a, b));
                        break;
                    case 2:
                        System.out.println("Subtraction = " + subtract(a, b));
                        break;
                    case 3:
                        System.out.println("Multiplication = " + multiply(a, b));
                        break;
                    case 4:
                      //  System.out.println("Division = " + division(a, b));
                     System.out.printf("Division = %.2f\n", division(a, b));
                        break;
                }
            } else if (choice != 5) {
                System.out.println("Invalid");
            }
        } while(choice != 5);
        System.out.println("Calculator exited");
        in.close();
    }
}
