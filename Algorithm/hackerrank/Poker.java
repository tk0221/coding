import java.util.StringTokenizer;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


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

		private Card[] cards;

	    //	    Hand(){};

	    public Hands(){} //constructor
	    // public void Hands(){}//method
	    
		public  void Hands(String s){
			cards = new Card[5];
			
			String delims = " ";
			StringTokenizer st = new StringTokenizer(s, delims);
			int i = 0;
			while(st.hasMoreTokens()) {
				cards[i++] = new Card(st.nextElement().toString());
			}
			
			
		}
	    public Card[] getCards(){
		return cards;
	    }

	}
    public static void showDown(Hands h1, Hands h2) {

	
	Card[] p1 = h1.getCards();
	Card[] p2 = h1.getCards();
	

    }


    
    
	public static void main(String[] args) {

	    Scanner in = new Scanner(System.in);
	    int test = in.nextInt();
	    in.nextLine();

	    while(test>0){
		String player1 = in.nextLine();
		int mid = player1.length()/2;
		String player2 = player1.substring(mid);
		player1 = player1.substring(0, mid);

		System.out.println(player1);
		System.out.println(player2);

		//	Hands h1=  new Hand();
		Hands h1 = null;
		Hands h2 = null;
		h1.Hands(player1);
	        h2.Hands(player2);

		
 
		
		--test;
	    }
	    
	    
	}
}
