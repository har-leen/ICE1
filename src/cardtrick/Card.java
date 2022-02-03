package cardtrick;

public class Card {

    private int numbers;  // encapsulate it getters and setters
    private String suit;
    public static final String[] SUITS = {"diamonds", "spades", "clubs", "hearts"};

    public Card(int numbers, String suit) {
        setNumbers(numbers);
        setSuits(suit);
        randomSuit(suit);
    }

    Card() {
    }

    /**
     * @return the numbers
     */
    public int getNumbers() {
        return numbers;
    }

    /**
     * @param numbers the numbers to set
     */
    public void setNumbers(int numbers) {
        numbers = 1 + ((int) (Math.random() * 13));
        this.numbers = numbers;
    }

    /**
     * @return the suit
     */
    public String getSuits() {
        return this.suit;

    }

    /**
     * @param suit the suit to set
     */
    public void setSuits(String suit) {
        if (suit.equalsIgnoreCase(SUITS[0]) || suit.equalsIgnoreCase(SUITS[1]) || suit.equalsIgnoreCase(SUITS[2])
                || suit.equalsIgnoreCase(SUITS[3])) {
            this.suit = suit;
        } else {
            System.out.println("Try again");
        }
        
    }

    public String randomSuit(String suit) {
        int randomNum = (int) (1 + (Math.random() * 4));
        if (randomNum == 1) {
            suit = SUITS[0];
        } else if (randomNum == 2) {
            suit = SUITS[1];
        } else if (randomNum == 3) {
            suit = SUITS[2];
        } else if (randomNum == 4) {
            suit = SUITS[3];
        } 
        return this.suit = suit;
    }
    
    public String toString(){
        return "Number: " + this.numbers + ", Suit: " + this.suit;
    }

}
// Harleen Kaur
// 991628857
