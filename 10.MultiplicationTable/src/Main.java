import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i <= 10; i++)
        {
            System.out.println(a + " X " + i + " = " + a * i);
        }
    }
}