//Run Time: 22ms
import regy.library;
public class p010 {
	public static String run() {
		boolean[] primes = library.sieveOfEratosthenes(1999999);
		long result = 0;
		for(int i = 1; i < primes.length; i++) {
			if(primes[i])
				result += i;
		}
		return Long.toString(result);
	}
}
