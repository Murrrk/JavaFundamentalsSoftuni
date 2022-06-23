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

        int sum_pos = 0;
        int sum_neg = 0;

        for(int i = 0; i < numArr.length; i++) {

            if (numArr[i] % 2 == 0)
            {
                sum_pos = sum_pos + numArr[i];
            }
            else
            {
                sum_neg = sum_neg + numArr[i];
            }
        }
        System.out.print(sum_pos - sum_neg);
    }
}