//Run Time: 12ms
import regy.library;
public class p046 {
	public static String run() {
		int result=1, primes[] = library.primeList(10000);
		boolean notFound = true;
		while(notFound){
			result += 2;

			int j = 0;
			notFound = false;
			while (result >= primes[j]) {
				if(isTwiceSquare(result-primes[j])){
					notFound = true;
					break;
				}
				j++;
			}                
		}
        return Integer.toString(result);
	}

	private static boolean isTwiceSquare(long number) {
		double squareTest = Math.sqrt(number/2);
		return squareTest == ((int)squareTest);
	}
}
