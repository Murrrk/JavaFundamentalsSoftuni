import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double m = Double.parseDouble(scan.nextLine());

        double km = m * 1.36;
        System.out.printf("%.3f", km);
    }
}