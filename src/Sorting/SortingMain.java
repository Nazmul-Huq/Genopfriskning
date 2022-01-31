package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortingMain {

    // make scanner object
    static Scanner scanner = new Scanner(System.in);

    // make a String array of size 5
    static String[] words = new String[5];

    public static void main(String[] args) {


        // get five words from user
        getFiveWord();

        //print words before sorting
        System.out.println("Words before sorting: ");
        printWordsArray(words);
        System.out.println(); // make an extra empty line to make output readable

        //sort the words array
        Arrays.sort(words);

        // print words after sorting
        System.out.println("Words after sorting: ");
        printWordsArray(words);






    } // main() ends here

    public static void printWordsArray(String[] words){
        for (String word:words) {
            System.out.println(word);
        }
    }

    /**
     * get five words from user and save to the arraylist "words"
     */
    public static void getFiveWord(){
        //get 5 words from user and add them to the arraylist (words)
        System.out.println("Please enter 5 word one by one");
        int index = 0;
        while (index < 5){
            System.out.println("Enter word no. " + (index+1));

            // get a word
            String word = scanner.nextLine();

            // add the word to the arraylist
            words[index] = word;

            index +=1;
        }
    }


} // class SortingMain ends here
