package cardtrick;

import static cardtrick.Card.SUITS;
import java.util.Random;
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {

        Card c = new Card();
        c.getSuits();
        c.getNumbers();
        int numbers = 0;
        String suit = "";

        Card[] magicHand = new Card[7];//Array of Object
        // Random random = new Random();
        //int n = random.nextInt(3);

        for (int i = 0; i < magicHand.length; i++) {
            // c.setNumbers(numbers); //write here random generation fo number or use methods
            // c.setSuits(SUITS[n]);

            magicHand[i] = new Card();
            // stores the card object in array
            magicHand[i].setNumbers(numbers);
            magicHand[i].randomSuit(suit);
            // System.out.println(magicHand[i].getNumbers() + ", " + magicHand[i].randomSuit(suit));
            System.out.println(magicHand[i].toString());
        }

        Scanner k = new Scanner(System.in);
        System.out.print("Enter a number bewtween 1 - 13: ");
        int num = k.nextInt();
        if (num > -1 && num < 14) {
            System.out.print("Enter a suit from deck of cards: ");
            suit = k.next();
            for (int i = 0; i < 1; i++) {
                magicHand[i].getSuits();
            }
        }
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getSuits().equals(suit)) {
                if (magicHand[i].getNumbers() == num) {
                    System.out.println("Card Found");
                }
            }
        }
        
    }
// step 2 take input from user, guess the card -- 2 spades -- find in array -- print message card is found -- else not found
// complete the code and push it to the repository
// step 3 hard coded card details in RR 
//like  card no = 2, hearts 
// find card it array
// pull it back
}
