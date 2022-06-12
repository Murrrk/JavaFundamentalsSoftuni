import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        //повтаряме: число > 0
        //стоп: число <= 0

        int sum = 0; //сума от цифрите
        while (number > 0) {
            //1. взимаме последната цифра
            int lastDigit = number % 10;
            //2. сумираме
            sum += lastDigit;
            //3. премахваме от числото
            number = number / 10;
        }

        System.out.println(sum);
    }
}