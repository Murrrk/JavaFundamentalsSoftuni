import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = Integer.parseInt(scanner.nextLine());

        int m = Integer.parseInt(scanner.nextLine());

        m = m + 30;

        if(m >= 60)
        {
            m = m - 60;
            h++;
        }
        if(h >= 24)
        {
            h = h - 24;
        }
        if(m > 10)
        {
            System.out.println(h + ":" + m);
        }
        else
        {
            System.out.println(h + ":0" + m);
        }
    }
}