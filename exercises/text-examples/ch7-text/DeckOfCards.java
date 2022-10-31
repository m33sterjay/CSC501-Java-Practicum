public class DeckOfCards {
    public static void main(String[] args) {
        // declare && initialize new array, int type, with a size of [52]
        int[] deck = new int[52];
        // declare && initialize 2 new arrays, String type, [suits] && [ranks]
        String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
        // [suits] indices assigned String values of the names of the 4 card suits
        // [ranks] indices assigned String values of each card value in each suit
        String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
        // 'i' set to 0; while 'i' is less than the length of array [deck], increment 'i' by one each iteration
        for (int i = 0; i < deck.length; i++) {
            // each iteration, [deck] indice 'i' is assigned current value of 'i'
            deck[i] = i;
        }
        // 'i' set to 0; while 'i' is less than the length of array [deck], increment 'i' by one each iteration
        for (int i = 0; i < deck.length; i++) {
            // initialize int type variable 'index', assign a random number as an int between based on [deck]'s length
            int index = (int) (Math.random() * deck.length); // number between 1 && 52
            // initialize int type, 'temp', assign 'temp' the value at indice 'i' in [deck]
            int temp = deck[i];
            // assign [deck] indice 'i' the value of 'index' : a random number between 1 && 52
            deck[i] = deck[index];
            // assign [deck] indice 'index' the value of 'temp'
            deck[index] = temp;
        }
        /** FROM TEXT: ** NEED TO STUDY THIS **
         * "Lines 13-19 shuffle the deck. After a deck is shuffled, deck[i] contains an arbitrary value." */
        
        // 'i' set to 0; while 'i' is less than 4 ** NUMBER OF SUITS **, increment 'i' by one each iteration:
        for (int i = 0; i < 4; i++) {
            // picks a random card suit from an indice in [suits]
            String suit = suits[deck[i] / 13];
            // picks a random card value from an indice in [ranks]
            String rank = ranks[deck[i] % 13];
            // displays random card number in [deck], the [rank] of the card, and the [suit] of the card
            System.out.println("card number " + deck[i] + ": " + rank + " of " + suit);
        }
    }
}
/** Summary:
 * A program that randomly draws 4 cards and displays the card information. */
/** KEY TAKEAWAYS:
 * - using variables inside of arrays - ** how does that work??? **
 * - ** THE DECK SHUFFLE ** I don't understand it
 * - arrays with String type
 * - assigning values to indices when initiating array */
