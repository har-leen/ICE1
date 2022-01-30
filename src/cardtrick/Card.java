package cardtrick;

public class Card {

    private int numbers;  // encapsulate it getters and setters
    private String suit;
    public static final String[] SUITS = {"diamonds", "spades", "clubs", "hearts"};

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
        this.numbers = numbers;
    }

    /**
     * @return the suits
     */
    public String getSuits() {
        return suit;
    }

    /**
     * @param suits the suits to set
     */
    public void setSuits(String suits) {
        this.suit = suits;
    }

}
