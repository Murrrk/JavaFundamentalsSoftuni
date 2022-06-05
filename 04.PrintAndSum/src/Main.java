import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int b = scan.nextInt();

        for (int i = a; i <= b; i++)
        {
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println("\nSum: " + sum);
    }
}