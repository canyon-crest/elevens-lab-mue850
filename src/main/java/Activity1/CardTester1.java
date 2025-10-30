package Activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester1 {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card1 card1 = new Card1("Jack", "Spades", 10);
		Card1 card2 = new Card1("Jack", "Spades", 10);
		Card1 card3 = new Card1("Ace", "Hearts", 13);
		card1.matches(card2);
		System.out.print(card1);
		card1.rank();
		card2.pointValue();
		
	}
}
