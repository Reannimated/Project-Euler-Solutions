//Run Time: 12ms
import regy.library;

public class p046 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
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
		System.out.println(result);
		System.out.println(System.currentTimeMillis()-start+"ms");
	}

	private static boolean isTwiceSquare(long number) {
		double squareTest = Math.sqrt(number/2);
		return squareTest == ((int)squareTest);
	}
}
