import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double m = Double.parseDouble(scan.nextLine());

        double km = m / 1000;
        System.out.printf("%.2f", km);
    }
}