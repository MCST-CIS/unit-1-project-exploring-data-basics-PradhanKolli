import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age < 18) {
            System.out.println("You can't apply for a loan yet.");
            return;
            
        }

        System.out.print("Hi " + name + ", please enter how much money you would like to borrow: ");
        double amount = input.nextDouble();

        double interestRate = 0.08;
        double totalAmount = amount * (1 + interestRate);

        System.out.printf("Your interest rate is: %.2f%%.%n", interestRate * 100);
        System.out.printf("The total amount you will have to pay back is: $%.2f.%n", totalAmount);

        System.out.print("How many years would you like for the loan period to be: ");
        int years = input.nextInt();

        int months = years * 12;
        double monthlyRate = totalAmount / months;

        System.out.printf("Your loan period is: %d years (%d months).%n", years, months);
        System.out.printf("Your monthly payment will be: $%.2f.%n", monthlyRate);

        System.out.println("Thank you for working with us, " + name + ".");
    }
}