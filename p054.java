//Run Time: 141ms
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
		int count = 0;
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
			if(compareHands(player1, player2))
				count++;
			System.out.println(line + " " + compareHands(player1, player2));
		}
		System.out.println(count);
		System.out.println(System.currentTimeMillis()-start+"ms");
	}
	
	static boolean compareHands(hand p1, hand p2) {
		p1.sort();
		p2.sort();
		if(p1.royalFlush() && !p2.royalFlush())
			return true;
		else if(p2.royalFlush() && !p1.royalFlush())
			return false;
		else {
			if(p1.straightFlush() && !p2.straightFlush())
				return true;
			else if(p2.straightFlush() && !p1.straightFlush())
				return false;
			else {
				if(p1.fourOfAKind() > p2.fourOfAKind())
					return true;
				else if(p2.fourOfAKind() > p1.fourOfAKind())
					return false;
				else {
					if(p1.fullHouse() > p2.fullHouse())
						return true;
					else if(p2.fullHouse() > p1.fullHouse())
						return false;
					else {
						if(p1.flush() && !p2.flush())
							return true;
						else if(p2.flush() && !p1.flush()) {
							return false;
						}
						else {
							if(p1.straight() && !p2.straight())
								return true;
							else if(p2.straight() && !p1.straight())
								return false;
							else {
								if(p1.threeOfAKind() > p2.threeOfAKind())
									return true;
								else if(p2.threeOfAKind() > p1.threeOfAKind())
									return false;
								else {
									if(p1.twoPairs() > p1.twoPairs())
										return true;
									else if(p2.twoPairs() > p1.twoPairs())
										return false;
									else {
										if(p1.pair() > p2.pair())
											return true;
										else if(p2.pair() > p1.pair())
											return false;
										else {
											if(p1.highCard() > p2.highCard())
												return true;
											else 
												return false;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
class card {
	public int rank;
	public char suit;
	public card(int a, char b) {
		rank = a;
		suit = b;
	}
}

class hand {
	public card[] myHand;
	private int n = 0;

	public hand() {
		myHand = new card[5];
	}

	void addCard(card c) {
		if(n < 5)
			myHand[n++] = c;
	}

	boolean isFull() {
		return n == 5;
	}

	void sort() {
		for(int x=0; x<n; x++){
			for(int y=0; y<n-1; y++) {
				if(myHand[y].rank > myHand[y+1].rank) {
					card temp = myHand[y+1];
					myHand[y+1] = myHand[y];
					myHand[y] = temp;
				}
			}
		}
	} 

	boolean royalFlush() {
		char suit = myHand[0].suit;
		for(int i = 0; i < 5; i++) {
			if(myHand[i].rank != i+10 || myHand[i].suit != suit)
				return false;
		}
		return true;
	}

	boolean straightFlush() {
		char suit = myHand[0].suit;
		for(int i = 0; i < 5; i++) {
			if(myHand[i].rank != myHand[0].rank + i || myHand[i].suit != suit)
				return false;
		}
		return true;
	}

	int fourOfAKind() {
		boolean case1 = true, case2 = true;
		int rank = myHand[3].rank;
		for(int i = 0; i < 4; i++) {
			if(myHand[i].rank != rank)
				case1 = false;
		}
		if(case1)
			return rank;
		for(int i = 1; i < 5; i++) {
			if(myHand[i].rank != rank)
				case2 = false;
		}
		if(case2)
			return rank;
		return 0;
	}

	double fullHouse() {
		if(threeOfAKind() != 0 && pair() != 0)
			return threeOfAKind() + pair() * .01;
		return 0;
	}

	boolean flush() {
		char suit = myHand[0].suit;
		for(int i = 0; i < 5; i++) {
			if(myHand[i].suit != suit)
				return false;
		}
		return true;
	}

	boolean straight() {
		for(int i = 0; i < 5; i++) {
			if(myHand[i].rank != myHand[0].rank + i)
				return false;
		}
		return true;
	}

	int threeOfAKind() {
		boolean case1 = true, case2 = true, case3 = true;;
		int rank = myHand[2].rank;
		for(int i = 0; i < 3; i++) {
			if(myHand[i].rank != rank)
				case1 = false;
		}
		if(case1)
			return rank;
		for(int i = 1; i < 4; i++) {
			if(myHand[i].rank != rank)
				case2 = false;
		}
		if(case2)
			return rank;
		for(int i = 2; i < 5; i++) {
			if(myHand[i].rank != rank)
				case3 = false;
		}
		if(case3)
			return rank;
		return 0;
	}

	double twoPairs() {
		int firstPair = 0, loc1 = 0, secondPair = 0;
		if(fourOfAKind() != 0)
			return 0;
		for(int i = 4; i > 0; i--) {
			if(myHand[i].rank == myHand[i-1].rank) {
				firstPair = myHand[i].rank;
				loc1 = i;
				break;
			}
		}

		for(int i = loc1-2; i > 0; i--) {
			if(myHand[i].rank == myHand[i-1].rank && myHand[i].rank != firstPair) {
				secondPair = myHand[i].rank;
				break;
			}
		}
		return firstPair + secondPair * .01;
	}

	int pair() {
		int three = threeOfAKind();
		int four = fourOfAKind();
		for(int i = 4; i > 0; i--) {
			if(myHand[i].rank == myHand[i-1].rank && myHand[i].rank != three && myHand[i].rank != four)
				return myHand[i].rank;
		}
		return 0;
	}

	int highCard() {
		int pair1 = (int)twoPairs();
		int pair2 = (int)(twoPairs() - pair1 * 100);
		for(int i = 4; i > 0; i--) {
			if(myHand[i].rank != pair1 || myHand[i].rank != pair2)
				return myHand[i].rank;
		}
		return 0;
	}
}
