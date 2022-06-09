import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double m = Integer.parseInt(scan.nextLine());

        double km = m / 1000.0;
        System.out.printf("%.2f", km);
    }
}