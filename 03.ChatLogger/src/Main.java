import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> chat = new ArrayList<>();

        String command = scan.nextLine();

        while(!command.equals("end"))
        {
            String commandName = command.split(" ")[0];

            if(commandName.equals("Chat"))
            {
                String value = command.split(" ")[1];
                chat.add(value);
            }
            else if(commandName.equals("Delete"))
            {
                String value = command.split(" ")[1];
                chat.remove(value);
            }
            else if(commandName.equals("Edit"))
            {
                String value = command.split(" ")[1];
                String edited = command.split(" ")[2];
                int index = chat.indexOf(value);
                chat.set(index, edited);
            }
            else if(commandName.equals("Pin"))
            {
                String value = command.split(" ")[1];

                String temp = value;
                chat.remove(value);
                chat.add(temp);
            }
            else if(commandName.equals("Spam"))
            {
                List<String> value = new ArrayList<>(Arrays.asList(command.split(" ")));
                value.remove("Spam");
                chat.addAll(value);
            }

            command = scan.nextLine();
        }
        System.out.println(String.join("\n", chat));
    }
}