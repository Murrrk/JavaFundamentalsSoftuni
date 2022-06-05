import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();
        String b = "";
        String c = "";
        int counter = 0;

        for (int q = a.length() - 1; q >= 0; q--)
        {
            char g = a.charAt(q);
            b = b + g;
        }
        c = scan.nextLine();

        while (!b.equals(c))
        {
            counter ++;
            if (counter == 4) {
                System.out.printf("User %s blocked!", a);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            c = scan.nextLine();
        }
        if (b.equals(c))
        {
            System.out.printf("User %s logged in.", a);
        }
    }
}