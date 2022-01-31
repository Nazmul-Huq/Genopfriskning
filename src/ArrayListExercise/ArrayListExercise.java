package ArrayListExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExercise {

    public static void main(String[] args) {

        // Make scanner object
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList and add some Strings in it
        List<String> names = new ArrayList<>();
        names.add("Nazmul");
        names.add("Peter");
        names.add("Romeo");

        // print the ArrayList before search for a string
        printList(names);


        // get the string to search
        String stringToFind = scanner.nextLine();

        // check if string already exist in the arraylist or not
        boolean isStringExist = doesArraylistContainString(names, stringToFind);

        // if string already exist print the message
        // if string do not exist, then add it to the arraylist
        if (isStringExist == true) {
            System.out.println("The String has been found");
        } else {
            System.out.println("String doesn't exits, so it is been added");
            names.add(stringToFind);
        }

        printList(names);

    } // main() ends here


    /**
     * Method to search for the given string in the given Arraylist
     * If found, will return true.
     * If not found, will return false, plus, insert the string in the Arraylist
     */
    public static boolean  doesArraylistContainString(List<String> list, String searchString){
        boolean isStringFound = false;

        for (int i = 0; i < list.size(); i++) {
            String elementAtI = list.get(i);
            if (elementAtI.equalsIgnoreCase(searchString)) {
                isStringFound = true;
                break;
            }
        }

       return isStringFound;
    }

    // print all items of a given list
    public static void printList(List<String> names){
        for (String name:names) {
            System.out.println(name);
        }
    }

} // class ArrayList ends here
