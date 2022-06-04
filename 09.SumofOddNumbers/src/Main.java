import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String l = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for(int i = 1; i <= a; i++)
        {
            System.out.println(2 * i - 1);
            sum += 2 * i - 1;
        }
        System.out.println("Sum: " + sum);
    }
}