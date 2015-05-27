import java.util.StringTokenizer;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Poker {

    
    final public static char[] KINDS = { '2', '3', '4', '5', '6', '7', '8',
					 '9', 'T', 'J', 'Q', 'K', 'A' };

    private static class Card {

	private char s; //KDHS
	private char k; //value


	public Card(){};
	public Card(char s, char k) {
	    this.s = s;
	    this.k = k;
	}

	public Card(String str) {
	    //    System.out.println("DEBUG: " + str);
	    this.k = str.charAt(0);
	    this.s = str.charAt(1);
	    // System.out.println("DEBUG : end");
	}

	
	
    }

    private static class Hands {

	public Card[] cards = new Card[5];

	public Hands(String s){
			
	    String delims = " ";
	    StringTokenizer st = new StringTokenizer(s, delims);
	    int i = 0;
	    while(st.hasMoreTokens()) {
		String tmp = st.nextElement().toString();
		this.cards[i++] = new Card(tmp);
		//		System.out.println(tmp);
	    }
	    // System.out.println("sucess");
			
	}
	public Card[] getCards(){
	    return cards;
	}

    }
    public static void showDown(Hands h1, Hands h2) {

	
	Card[] p1 = h1.getCards();
	Card[] p2 = h1.getCards();

	
	
	int p1_val = value(p1);
	int p2_val = value(p2);

	System.out.println("FINISH");
    }

    public static int value(Card[] player){

        

	
    }


    
    
    public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
	int test = in.nextInt();
	in.nextLine();

	while(test>0){
	    String fortest = "2H 2C 2S 2D KH JH JC JD JS KS";
	    String player1 = fortest;//in.nextLine();
	    int mid = player1.length()/2;
	    String player2 = player1.substring(mid+1);
	    player1 = player1.substring(0, mid);

	    System.out.println(player1);
	    System.out.println(player2);

	    //	Hands h1=  new Hand();

	    System.out.println(player1);
	    System.out.println(player2);
	    Hands h1 = new Hands(player1);
	    Hands h2 = new Hands(player2);
	    // h1.Hands(player1);
	    // h2.Hands(player2);
	    showDown(h1, h2);

		
 
		
	    --test;
	}
	    
	    
    }
}
