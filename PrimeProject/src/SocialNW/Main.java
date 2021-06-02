package SocialNW;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.println("if you want to exit simply enter 0");
        while(true)
        {
            System.out.println("Enter the number");
            boolean prime = true;
            double num = read.nextInt();
            if(num==0)
            {
                System.out.println("We're happy to use our program");
                break;
            }

            for (int i = 2; i < num; i++) {
                if (num == i) continue;
                else if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) System.out.println("the number is prime\n");
            if (!prime) System.out.println("the number is not prime\n");
        }
    }
}
