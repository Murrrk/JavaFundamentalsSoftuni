import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] days = {"Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday","Sunday"};

        int n = Integer.parseInt(scan.nextLine());

        if(n > 0 && n <= 7) {
            System.out.println(days[n - 1]);
        }
        else
        {
            System.out.printf("Invalid day!");
        }

    }
}