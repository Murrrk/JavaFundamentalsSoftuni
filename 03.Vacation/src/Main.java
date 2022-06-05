import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        String b = scan.nextLine();
        String c = scan.nextLine();
        double sum = 0;

        if(b.equals("Students"))
        {
            if(c.equals("Friday"))
            {
                sum = 8.45 * a;
                if (a >= 30)
                {
                    sum = sum * 0.85;
                    System.out.printf("Total price: %.2f", sum);
                }
                else
                {
                    System.out.printf("Total price: %.2f", sum);
                }
            }
            else if(c.equals("Saturday"))
            {
                sum = 9.80 * a;
                if (a >= 30)
                {
                    sum = sum * 0.85;
                    System.out.printf("Total price: %.2f", sum);
                }
                else
                {
                    System.out.printf("Total price: %.2f", sum);
                }
            }
            else if(c.equals("Sunday"))
            {
                sum = 10.46 * a;
                if (a >= 30)
                {
                    sum = sum * 0.85;
                    System.out.printf("Total price: %.2f", sum);
                }
                else
                {
                    System.out.printf("Total price: %.2f", sum);
                }
            }
        }
        else if(b.equals("Business"))
        {
            if(c.equals("Friday"))
            {
                sum = 10.90 * a;
                if (a >= 100)
                {
                    sum = sum - (10.90 * 10);
                    System.out.printf("Total price: %.2f", sum);
                }
                else
                {
                    System.out.printf("Total price: %.2f", sum);
                }
            }
            else if(c.equals("Saturday"))
            {
                sum = 15.60 * a;
                if (a >= 100)
                {
                    sum = sum - (10.90 * 10);
                    System.out.printf("Total price: %.2f", sum);
                }
                else
                {
                    System.out.printf("Total price: %.2f", sum);
                }
            }
            else if(c.equals("Sunday"))
            {
                sum = 16 * a;
                if (a >= 100)
                {
                    sum = sum - (10.90 * 10);
                    System.out.printf("Total price: %.2f", sum);
                }
                else
                {
                    System.out.printf("Total price: %.2f", sum);
                }
            }
        }
        if(b.equals("Regular"))
        {
            if(c.equals("Friday"))
            {
                sum = 15 * a;
                if (a >= 10 && a <= 20)
                {
                    sum = sum * 0.95;
                    System.out.printf("Total price: %.2f", sum);
                }
                else
                {
                    System.out.printf("Total price: %.2f", sum);
                }
            }
            else if(c.equals("Saturday"))
            {
                sum = 20 * a;
                if (a >= 10 && a <= 20)
                {
                    sum = sum * 0.95;
                    System.out.printf("Total price: %.2f", sum);
                }
                else
                {
                    System.out.printf("Total price: %.2f", sum);
                }
            }
            else if(c.equals("Sunday"))
            {
                sum = 22.50 * a;
                if (a >= 10 && a <= 20)
                {
                    sum = sum * 0.95;
                    System.out.printf("Total price: %.2f", sum);
                }
                else
                {
                    System.out.printf("Total price: %.2f", sum);
                }
            }
        }
    }
}