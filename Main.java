/*
* This is the standard Main() class starting point.
*
* @author  Daria Bernice Calitis
* @version 11.0.16
* @since   2022-10-03
*/

// Imports
import java.util.Scanner;

/**
*  Main class.
*/
final class Main {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        // Declaring classes.
        final Scanner scan = new Scanner(System.in);
        final MrCoxallStack stack = new MrCoxallStack();

        System.out.print("Enter a number: ");
        final int userNum = scan.nextInt();
        stack.push(userNum);

        stack.showStack();

        System.out.println("\nDone.");
    }
}

