import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");

        for(int j = arr.length - 1; j >= 0; j--)
        {
            System.out.print(arr[j] + " ");
        }
    }
}
