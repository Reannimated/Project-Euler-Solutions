//Run Time: 16ms
import regy.library;
public class p007 {
	public static String run() {
		int i = 3, primes = 1;
		while(primes < 10001) {
			if(library.isPrime(i))
				primes++;
			i++;
		}
		return Integer.toString(i-1);
	}
}
