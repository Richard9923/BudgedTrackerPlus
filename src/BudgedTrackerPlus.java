import java.util.Scanner;

public class BudgedTrackerPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your monthly income:  $");
        double income = scanner.nextDouble();

        System.out.println("Please enter your rent cost: $");
        double rent = scanner.nextDouble();

        System.out.println("Please enter your groceries expense: $");
        double groceries = scanner.nextDouble();

        System.out.println("Please enter your transportation expense: $");
        double transportation = scanner.nextDouble();

        System.out.println("Please enter your entertainment expense: $");
        double entertainment = scanner.nextDouble();

        double totalExpenses = rent + groceries + transportation + entertainment;
        double remainingBudget = income - totalExpenses;

        double rentPercentage = (rent/income) * 100;
        double groceriesPercentage = (groceries/income) * 100;
        double transportationPercentage = (transportation/income) * 100;
        double entertainmentPercentage = (entertainment/income) * 100;

        System.out.println("\n***** Budget Symmary ******");
        System.out.printf("Monthly Income: $%.2f\n", income);
        System.out.printf("Total Expenses: $%.2f\n", totalExpenses);
        System.out.printf("Remaining Budget: $%.2f\n", remainingBudget);
        System.out.println("Expenses Breakdowm: ");
        System.out.printf("Rent: $%.2f ($%.2f%% of income)\n", rent, rentPercentage);
        System.out.printf("Groceries: $%.2f ($%.2f%% of income)\n", groceries, groceriesPercentage);
        System.out.printf("Transportation: $%.2f ($%.2f%% of income)\n", transportation, transportationPercentage);
        System.out.printf("Entertainment: $%.2f ($%.2f%% of income)\n", entertainment, entertainmentPercentage);
    }
}