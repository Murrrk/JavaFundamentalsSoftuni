import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char a = scan.next().charAt(0);

        if (Character.isUpperCase((a)))
        {
            System.out.println("upper-case");
        }
        else
        {
            System.out.println("lower-case");
        }
    }
}