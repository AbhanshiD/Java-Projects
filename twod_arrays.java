import java.util.Scanner;

public class twod_arrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[][] telephone = { { '1', '2', '3' },
                { '4', '5', '6' },
                { '7', '8', '9' },
                { '*', '0', '#' } };

        for (char[] row : telephone) {

            for (char number : row) {

                System.out.print(number + " ");

            }

            System.out.println();

        }

        scanner.close();

    }

}
