import java.util.Scanner;

public class mad_libes {
    public static void main(String[] args) {

        // MAD LIBS GAMES

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter an noun (name, place, animal, thing): ");
        noun1 = scanner.nextLine();

        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter an verb (action in present form): ");
        verb1 = scanner.nextLine();

        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();

        System.out.println("Today I went to a " + adjective1 + "concert.");
        System.out.println("There i had a close look of  " + noun1 + ".");
        System.out.println(noun1 + " was soo " + adjective2 + " and we were  " + verb1 + " soo loud!");
        System.out.println("I was " + adjective3 + "!");

        scanner.close();

    }
}
