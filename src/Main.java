import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = inputScanner.nextLine();
        System.out.println("Welcome to the adventure " + name + "!");
        System.out.println("Would you like to begin your journey, yes or no?");
        String beginning = inputScanner.nextLine();

        if (beginning.equalsIgnoreCase("yes")){
            System.out.println("Excellent " + name + "! I'm glad to hear you are ready.");}
        else if (beginning.equalsIgnoreCase("no")){
            System.out.println("Too bad!");}
        else{
            System.out.println("That is not a valid answer.");}

        System.out.println("You enter a room. There is a door on the left and a door on the right. Would you like to 1- search the room? 2-" +
                "move to the door on the left? or 3- move to the door on the right? ");



        while (true) {
            String input = inputScanner.nextLine();
            String[] words = input.split(" ", 2);
            String verb = words[0];
            String noun = "";
            if(words.length > 1) noun = words[1];

            switch (verb.toLowerCase(Locale.ROOT)) {
                case "move":
                    switch (noun.toLowerCase(Locale.ROOT)) {
                        case "north":
                            break;
                        case "east":
                            break;
                        case "south":
                            break;
                        case "west":
                            break;
                    }
            }
        }

    }
}