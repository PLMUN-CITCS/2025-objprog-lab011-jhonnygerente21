public class NumberClassifierMenu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char userChoice = 'Y'; // Initialize userChoice to 'Y' to enter the loop

        do {
            // Display the menu
            System.out.println("\n=== Number Classifier Menu ===");
            System.out.println("1. Classify a number as positive, negative, or zero");
            System.out.println("2. Print a multiplication table for a given number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            int choice = input.nextInt();  // Get user's menu choice

            switch (choice) {
                case 1: 
                    // Code for option 1: Classify a number
                    System.out.print("Enter a number to classify: ");
                    int number = input.nextInt();
                    if (number > 0) {
                        System.out.println("The number " + number + " is positive.");
                    } else if (number < 0) {
                        System.out.println("The number " + number + " is negative.");
                    } else {
                        System.out.println("The number is zero.");
                    }
                    // Check if the number is even or odd
                    if (number % 2 == 0) {
                        System.out.println("It is also an even number.");
                    } else {
                        System.out.println("It is an odd number.");
                    }
                    break;

                case 2:
                    // Code for option 2: Multiplication table
                    System.out.print("Enter a number to display its multiplication table: ");
                    int tableNumber = input.nextInt();
                    System.out.println("Multiplication Table for " + tableNumber + ":");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(tableNumber + " x " + i + " = " + (tableNumber * i));
                    }
                    break;

                case 3:
                    // Code for option 3: Exit
                    System.out.println("Exiting the program. Goodbye!");
                    userChoice = 'N'; // Set userChoice to 'N' to exit the loop
                    break;

                default:
                    // Handle invalid choice
                    System.out.println("Invalid option. Please choose between 1 and 3.");
            }

            // Ask the user if they want to return to the menu
            if (choice != 3) {  // Don't ask to continue if the user chooses to exit
                System.out.print("Do you want to return to the menu? (Y/N): ");
                input.nextLine(); // Consume the newline character left by nextInt()
                userChoice = input.nextLine().toUpperCase().charAt(0); // Get the user's response
            }

        } while (userChoice == 'Y'); // Continue if the user wants to return

        input.close(); // Close the scanner after the loop
    }
}
