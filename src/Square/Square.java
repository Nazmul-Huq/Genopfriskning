package Square;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {

        // make scanner object
        Scanner scanner = new Scanner(System.in);

        // get the number of column/row to be printed
        System.out.println("PLease enter number of column/row to be printed: ");
        int numberOfRowColumn = Integer.parseInt(scanner.nextLine());

        // get the symbol (eg, *-, #, ., 1, &, - etc) to be used
        System.out.println("Please enter symbol to be printed: ");
        String symbol = scanner.nextLine();

        // print the square
        printSquare(numberOfRowColumn, symbol);

    } // main() ends here

    /**
     * method will print a square using of given size and using given symbol
     * @param numberOfRowColumn
     * @param symbol
     */
    public static void printSquare(int numberOfRowColumn, String symbol){

        // for loop to control number of rows
        for (int row = 0; row < numberOfRowColumn; row++) {

            // for loop to control number of column in each row
            for (int column = 0; column < numberOfRowColumn; column++) {
                System.out.print(symbol + " ");
            }

            // print linne break after each row
            System.out.println();
        }

    }

} // class Square ends here
