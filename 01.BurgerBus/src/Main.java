import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nCities = Integer.parseInt(scan.nextLine());

        double earned = 0;
        double sum = 0;

            for (int i = 1; i <= nCities; i++) {
                String name = scan.nextLine();
                double income = Double.parseDouble(scan.nextLine());
                double expense = Double.parseDouble(scan.nextLine());

                if (i % 5 == 0) {
                    income = income - (income * 0.1);
                } else if (i % 3 == 0) {
                    expense = expense + (expense * 0.5);
                    earned = income - expense;
                }
                earned = income - expense;

                System.out.printf("In %s Burger Bus earned %.2f leva. \n", name, earned);
                sum = sum + earned;
            }
            System.out.printf("Burger Bus total profit: %.2f leva.", sum);
        }
    }
