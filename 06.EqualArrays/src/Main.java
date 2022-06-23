import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr1 = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] arr2 = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int max;
        if(arr1.length >= arr2.length)
        {
             max = arr1.length;
        }
        else {
             max = arr2.length;
        }

        int sum1 = 0;
        boolean areNotIdentical = false;
        for(int i = 0; i<max; i++)
        {
            if(arr1[i] != arr2[i])
            {
                System.out.printf("Arrays are not identical. Found difference at " + i + " index.");
                areNotIdentical = true;
                break;
            }
            else
            {
                sum1 = sum1 + arr1[i];
            }
        }
        if(!areNotIdentical)
        {
            System.out.printf("Arrays are identical. Sum: %d", sum1);
        }
    }
}