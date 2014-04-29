import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


public class p054 {

	private static HashMap<String, Integer> convert = new HashMap<String, Integer>();	

	public static void main(String[] args) throws FileNotFoundException {
		long start = System.currentTimeMillis();
		Scanner file = new Scanner(new File("/Users/Regy/Programming/Java/Competitions/ProjectEuler/src/p054.txt"));
		convert.put("T", 10);
		convert.put("J", 11);
		convert.put("Q", 12);
		convert.put("K", 13);
		convert.put("A", 14);
		while(file.hasNext()) {
			String line = file.nextLine();
			int rank;
			char suit;
			hand player1 = new hand();
			hand player2 = new hand();
			for(int i = 0; i < 29; i += 3) {
				if(convert.containsKey(line.substring(i, i + 1)))
					rank = convert.get(line.substring(i, i + 1));
				else
					rank = Integer.parseInt(line.substring(i,i + 1));
				suit = line.charAt(i+1);
				card temp = new card(rank, suit);
				if(!player1.isFull())
					player1.addCard(temp);
				else
					player2.addCard(temp);
			}
		}
		System.out.println(System.currentTimeMillis()-start+"ms");
	}

}

class card {
	private int rank;
	private char suit;
	public card(int a, char b) {
		rank = a;
		suit = b;
	}
}

class hand {
	private card[] myHand;
	private int n = 0;
	public hand() {
		myHand = new card[5];
	}
	void addCard(card c) {
		if(n < 5)
			myHand[n++] = c;
	}
	boolean isFull(){
		return n == 5;
	}
}

