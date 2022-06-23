import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String lineInput = scan.nextLine();

        int[] numArr = Arrays
                .stream(lineInput.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;

        for(int i = 0; i < numArr.length; i++) {

            if (numArr[i] % 2 == 0)
            {
                sum = sum + numArr[i];
            }
        }
        System.out.print(sum);
    }
}