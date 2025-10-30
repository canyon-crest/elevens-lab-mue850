package Activity2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester2 {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] rank1 = {"Jack", "Queen", "King"};
		String[] suits = {"Spades", "Hearts"};
		int[] pointValues = {11,12,13};
		Deck2 d = new Deck2(rank1, suits, pointValues);
		d.deal();
		d.deal();
		d.deal();
		d.deal();
		d.deal();
		d.deal();
		System.out.print(d.isEmpty());
	}
}
