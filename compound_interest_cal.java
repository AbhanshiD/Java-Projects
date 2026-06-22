import java.util.Scanner;

public class compound_interest_cal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.println("Enter the principle amount:");
        principal = scanner.nextDouble();

        System.out.println("Enter the interest rate (in %):");
        rate = scanner.nextDouble() / 100;

        System.out.println("Enter the no of times compunded per year:");
        timesCompounded = scanner.nextInt();

        System.out.println("Enter the no of years:");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amout after %d years is $%.2f", years, amount);

        scanner.close();
    }
}
