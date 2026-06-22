import java.util.Scanner;

class program_calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean isValid = true;

        System.out.print("Enter the value of num1: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+,-,*,/,^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the value of num2: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot be divided by zero");
                    isValid = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);

            default -> {
                System.out.println("Invalid operator!");
                isValid = false;
            }
        }

        if (isValid) {
            System.out.println("Result = " + result);
        }

        scanner.close();
    }
}