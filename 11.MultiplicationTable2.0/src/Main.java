import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        do {
            System.out.printf("%d X %d = %d%n",a,b,a*b);

            b++;
        }while(b <=10);
    }
}