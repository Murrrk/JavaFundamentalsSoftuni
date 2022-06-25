import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //sc

        String a = scan.nextLine();
        double b = 0;
        while(!a.equals("special") && !a.equals("regular"))
        {
            if (Double.parseDouble(a) <= 0)
            {
                System.out.println("Invalid price!");
            }
            else
            {
                b = b + Double.parseDouble(a);

            }
            a = scan.nextLine();
        }

        if (b <= 0)
        {
            System.out.println("Invalid order!");
            return;
        }
        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$ \n", b);

        double c = b * 2 / 10;
        System.out.printf("Taxes: %.2f$ \n", c);

        System.out.println("-----------");

        double d = 0;
        if (a.equals("special"))
        {
            d = (b + c) * 9 / 10;
            System.out.printf("Total price: %.2f$", d);
        }
        else if (a.equals("regular"))
        {
            d = b + c;
            System.out.printf("Total price: %.2f$", d);
        }
    }
}