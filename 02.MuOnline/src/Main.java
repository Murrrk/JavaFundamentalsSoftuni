import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //sc

        int health = 100;
        int bitcoin = 0;
        boolean madeIt = false;

        String[] roomArr = scan.nextLine().split("\\|");

        for(int i = 0; i < roomArr.length; i++)
        {
            String[] room = roomArr[i].split(" ");
            String command = room[0];
            int num = Integer.parseInt(room[1]);

            if(command.equals("potion"))
            {
                int excess = 0;
                int after_heal = 0;
                after_heal = health + num; // 90 + 30

                if(after_heal > 100)
                {
                    int healed = health;
                    excess = after_heal - 100; // 120 - 100
                    health = after_heal - excess; // 120 - 20
                    System.out.printf("You healed for %d hp.\n", health - healed);
                }
                else
                {
                    System.out.printf("You healed for %d hp.\n", num);
                    health = after_heal;
                }

                System.out.printf("Current health: %d hp.\n", health);
            }
            else if(command.equals("chest"))
            {
                bitcoin = bitcoin + num;
                System.out.printf("You found %d bitcoins.\n", num);
            }
            else
            {
                if(health <= num)
                {
                    System.out.println("You died! Killed by " + room[0] + ".");
                    System.out.println("Best room: " + (i + 1));
                    madeIt = true;
                    break;
                }
                else
                {
                    health = health - num;
                    System.out.println("You slayed " + room[0] + ".");
                }
            }
        }
        if(!madeIt)
        {
            System.out.printf("You've made it!\nBitcoins: %d\nHealth: %d", bitcoin, health);
        }
    }
}