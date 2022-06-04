import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String l = scanner.nextLine();

        if(l.equals("England")  || l.equals("USA"))
        {
            System.out.println("English");
        }
        else if(l.equals("Spain") || l.equals("Argentina") || l.equals("Mexico"))
        {
            System.out.println("Spanish");
        }
        else
        {
            System.out.println("unknown");
        }
    }
}