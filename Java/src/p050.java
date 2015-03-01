//Run Time: 37ms
import regy.library;
public class p050 {
	public static String run() {
		long start = System.currentTimeMillis();
		int celing = (int) Math.pow(10, 6);
		boolean[] sieve = library.sieveOfEratosthenes(celing);
		int[] primes = library.primeList(celing);
		long maxsum=0;
		int maxchain=0,sum,chain;
		for(int i = 0; i < primes.length; i++) {
			sum = 0; chain = 0;
			for(int j = i; j < primes.length; j++) {
				sum += primes[j];
				chain = j - i;
				if(sum > celing)
					break;
				else if(chain > maxchain && sum > maxsum && sieve[sum]) {
					maxsum = sum;
					maxchain = chain;
				}
			}
		}
        return Long.toString(maxsum);
	}
}
