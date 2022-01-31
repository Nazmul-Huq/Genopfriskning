package ProperCase;

public class ProperCaseMain {

    public static void main(String[] args) {

        // make a sentence to modify and print it
        String sentence = "I love to code, DO You?";
        System.out.println("Sentence Before Modification: "+ sentence);

        // modify the sentence and print it
        String modifiedSentence = modifySentence(sentence);
        System.out.println("Sentence After  Modification: "+ modifiedSentence);

    } // main() ends here

    /**
     * method will look at every word of the given sentence and make changes as per following rules
     * Rule 1 - Word written in capital letter should not be changed
     * Rule 2 - Words of more than 3 letters must be written in lower case but starts with capital letter
     * Rule 3 - Words up to 3 letters must be written in lower case.
     * finally a whole sentence will be made and returned
     * @param sentence
     */
    public static String modifySentence(String sentence){
        // fist make a String array from the given sentence
        String[] words = sentence.split(" ");

        // check each word individually, modify the word following rules 1-3, replace the original word with modified
        for (int i = 0; i < words.length; i++) {

            String individualWord = words[i]; // get each word from the array

            boolean isWordCapitalized = isCapitalWord(individualWord); // check if word is capitalized or not

            // if word is capitalized we do nothing else change case following rules 2-3
            if (isWordCapitalized == false) {
                String modifiedWord = getModifiedWord(individualWord);
                words[i] = modifiedWord;
            }
        }

        // make a whole sentence from the string array and return it
        return buildSentence(words);
    }


    /**
     * modify a word following rules 2-3
     * Rule 2 - Words of more than 3 letters must be written in lower case but starts with capital letter
     * Rule 3 - Words up to 3 letters must be written in lower case.
     * @param word
     * @return
     */
    public static String getModifiedWord(String word){
        // make a char array from the word
        char[] chars = word.toCharArray();

        // count the numbers of letters in the char array, make sure we count only letters
        int numberOfCharacter = 0;
        for (int j = 0; j < chars.length; j++) {
            if (Character.isLetter(chars[j])) {
                numberOfCharacter +=1;
            }
        }

        // if word size is upto 3 letter then make it lower case (follow rule 2) else follow rule 3
        if (numberOfCharacter <= 3) {
            word =  word.toLowerCase();
        } else {
            word = word.substring(0, 1).toUpperCase() + word.substring(1);
        }
       return word;
    }

    /**
     * method to make a sentence from a string array
     * @param words
     * @return
     */
    public static String buildSentence(String[] words){
        StringBuilder builder = new StringBuilder();
        for(String s : words) {
            builder.append(s + " ");
        }
        String sentence = builder.toString();
        return sentence;
    }

    /**
     * check the given word to see if all the letters are capital or not
     * @param word
     * @return
     */
    public static boolean isCapitalWord(String word){

        for (int j = 0; j < word.length(); j++) {

            char charInWord = word.charAt(j); // get individual char from the given word

            if (Character.isLetter(charInWord)) {  // chek if the char is a letter or not

                // if the letter is not uppercase then return false
                if (!Character.isUpperCase(charInWord)) { // if the
                    return false;
                }
            }
        }
        return true;
    }

} // class ProperCaseMain ends here
