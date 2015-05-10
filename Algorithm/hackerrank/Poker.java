import java.util.StringTokenizer;

public class Poker {

	public enum SUITS {
		H('H'), D('D'), C('C'), S('S');
		char s;
		
		 SUITS(char in) {
			this.s = in;
		}

		public char getS() {
			return s;
		}

		public void setS(char s) {
			this.s = s;
		}
		
	}

	final public static char[] KINDS = { '2', '3', '4', '5', '6', '7', '8',
			'9', 'T', 'J', 'Q', 'K', 'A' };

	class Card {

		private SUITS s;
		private char k;

		public Card(SUITS s, char k) {
			this.s = s;
			this.k = k;
		}

		public Card(String str) {
			this.k = str.charAt(0);
			this.s.setS(str.charAt(1));
		}
	}

	class Hands {

		Card cards[];
		
		public void Hand(String s){
			cards = new Card[5];
			
			String delims = " ";
			StringTokenizer st = new StringTokenizer(s, delims);
			int i = 0;
			while(st.hasMoreTokens()) {
				cards[i++] = new Card(st.nextElement().toString());
			}
			
			
		}

	}

	public static void main(String[] args) {

	}
}
