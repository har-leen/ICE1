package cardtrick;

public class CardTrick {

    public static void main(String[] args) {
        
      Card [] magicHand = new Card [7]; //Array of Object
      
      for(int i=0; i<magicHand.length;i++){
          Card c = new Card();
          c.setNumbers(2); //write here random generation fo number or use methods
          c.setSuits("suit by random suit generation");
          magicHand[i]=c; // stores the card object in array
      }
// step 2 take input from user, guess the card -- 2 spades -- find in array -- print message card is found -- else not found
// complete the code and push it to the repository
// step 3 hard coded card details in RR 
//like  card no = 2, hearts 
// find card it array
// pull it back
    }

}
