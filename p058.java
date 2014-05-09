//Run Time: 291ms
import regy.library;

public class p058 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int primes = 0, n = 1;;
		while(true){
			for (int i = 0; i < 4; i++) {
				if (library.isPrime(n * n - i * (n - 1)))
					primes++;
			}
			double ratio = (double) primes / (2 * n - 1);
			if (n > 1 &&  ratio < .1) {
				System.out.println(n);
				break;
			}
			n += 2;
		}
		System.out.println(System.currentTimeMillis() - start + "ms");
	}
}
