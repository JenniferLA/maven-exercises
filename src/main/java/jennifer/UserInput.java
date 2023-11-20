package jennifer;

// Create a new class with a main method that prompts the user for input and does the following (using the StringUtils class)
// a. Tells whether or not what the user entered is a number
// b. Flips the case of the string
// c. Reverses the string

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class UserInput{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter something: ");
        String userInput = scanner.nextLine();

        // a. Tells whether or not what the user entered is a number
        Boolean isNumberInput = StringUtils.isNumeric(userInput);
        System.out.println("Tests if user has entered any numbers: " + isNumberInput);

        // b. Flips the case of the string
        String swapCase = StringUtils.swapCase(userInput);
        System.out.println("Flipped case string: " + swapCase);

        // c. Reverses the string
        String reverseCase = StringUtils.reverse(userInput);
        System.out.println("Reversed case string: " + reverseCase);
    }
}
