//Run Time: 291ms
import regy.library;
public class p058 {
    //Fix this
	public static String run() {
		int primes = 0, n = 1;
		while(true){
			for (int i = 0; i < 4; i++) {
				if (library.isPrime(n * n - i * (n - 1)))
					primes++;
			}
			double ratio = (double) primes / (2 * n - 1);
			if (n > 1 &&  ratio < .1) {
                return Integer.toString(n);
			}
			n += 2;
		}
	}
}
