package MowedGrass;

import java.util.Scanner;

public class GrassMain {

    public static void main(String[] args) {

        // make scanner object
        Scanner scanner = new Scanner(System.in);

        // get data from user
        System.out.println("Enter Current Length: ");
        double currentLength = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter Maximum Allowed Length: ");
        int maxLength = Integer.parseInt(scanner.nextLine());

        // print days left to be mowed
        System.out.println("Days left to be mowed : " + daysLeftToMowed(currentLength, maxLength));

    } // main() ends here

    /**
     * method to check how many days left before next mow
     * int this calculation, we have considered the grass length should exceed the maximum length before mowed
     * @return
     */
    public static double daysLeftToMowed(double currentLength, int maxLength){
        double growthPerDay = 0.8;
        // first get the length the grass need to grow to reach the maximum permitted length
        double lengthLeft = maxLength-currentLength;

        // calculate days left, and convert the value to its upper limit, eg, 1.2 or 1.5 or 1.8 will convert to 2
        double daysLeft = Math.ceil(lengthLeft / growthPerDay);

        // finally return days
        return daysLeft;
    }

} // class GrassMain ends here
