import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String l = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());

        if(l.equals("Weekday"))
        {
            if(a >= 0 && a <= 18)
            {
                System.out.println("12$");
            }
            else if(a > 18 && a <= 64)
            {
                System.out.println("18$");
            }
            else if(a > 64 && a<= 122)
            {
                System.out.println("12$");
            }
            else
            {
                System.out.println("Error!");
            }
        }
        else if(l.equals("Weekend"))
        {
            if(a >= 0 && a <= 18)
            {
                System.out.println("15$");
            }
            else if(a > 18 && a <= 64)
            {
                System.out.println("20$");
            }
            else if(a > 64 && a<= 122)
            {
                System.out.println("15$");
            }
            else
            {
                System.out.println("Error!");
            }
        }
        else if(l.equals("Holiday"))
        {
            if(a >= 0 && a <= 18)
            {
                System.out.println("5$");
            }
            else if(a > 18 && a <= 64)
            {
                System.out.println("12$");
            }
            else if(a > 64 && a<= 122)
            {
                System.out.println("10$");
            }
            else
            {
                System.out.println("Error!");
            }
        }
    }
}