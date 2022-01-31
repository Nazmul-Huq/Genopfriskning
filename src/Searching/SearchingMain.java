package Searching;

public class SearchingMain {

    public static int getIndexOfString(String[] words, String stringToFind){
        int index = -1;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(stringToFind)) {
                return i;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        // make an Arraylist og type String
        String[] words = {"dog", "cows", "fox"};
        String stringToFind = "cow";


        try {
            int index = getIndexOfString(words, stringToFind);
            System.out.println("The word " + words[index] + " was found at index " + index); // if index is -1 this line will throw exception
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("word was not found");
        }

    } // main() ends here

} // class SearchingMain ends here
