public class CountLettersInArray {
    public static void main(String[] args) {
        // createArray() method maps letters to [chars] index
        char[] chars = createArray();

        System.out.println("The lowercase letters are: ");
        // outputs the letters mapped to [chars] indices
        displayArray(chars);
        // countLetters() method maps count values to [counts], while being passed [chars]
        int[] counts = countLetters(chars);

        System.out.println();
        System.out.println("The occurrences of each letter are: ");
        // outputs the count values mapped to [counts] indices
        displayCounts(counts);
    }

    // maps random letters to indices in [chars]
    public static char[] createArray() {
        char[] chars = new char[100];
        for (int i = 0; i < chars.length; i++) {
            // each indice is assigned a random letter from ** a previous method I have made in a different file **
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();
        } // returns [chars] to main with random letters in array
        return chars;
    }

    // displays [char], 20 characters per line
    public static void displayArray(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0) {
                System.out.println(chars[i]);
            } else {
                System.out.print(chars[i] + " ");
            }
        }
    }

    // counts the occurences of each char in [chars]
    public static int[] countLetters(char[] chars) {
        // initialize [counts] with a size of 26
        int[] counts = new int[26];
        for (int i = 0; i < chars.length; i++) {
            // each iteratation, increments value at location in [counts], pertaining to each occurence of a letter
            counts[chars[i] - 'a']++;
            // [chars] is mapped to each letter, by the char value of location 'i' in [chars] (minus) 'a'
        } // return [counts] to 'main'
        return counts;
    }

    // display the contents of [counts] as mapped to each letter
    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) % 10 == 0) {
                System.out.println(counts[i] + " " + (char) (i + 'a'));
            } else {
                System.out.print(counts[i] + " " + (char) (i + 'a') + " ");
            }
        }
    }
}
/** Summary:
 * A program that generates 100 random lowercase letters and counts each letters occurrences. */
/** KEY TAKEWAYS:
 * - initializing arrays and defining their size by a method
 * - filling arrays with a method
 * - referencing a method from a previous java "class" file */