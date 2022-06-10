import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
           int currNum = i;

            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }

            if ((sum == 5) || (sum == 7) || (sum == 11)){
                System.out.printf("%d -> True%n", currNum);
            }
            else
            {
                System.out.printf("%d -> False%n", currNum);
            }
            sum = 0;
            i = currNum;
        }
    }
}