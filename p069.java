//Run Time: 23ms
import regy.library;

public class p069 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println(library.primorial(1000000));
		System.out.println(System.currentTimeMillis() - start + "ms");
	}
	/* In order to minimize the totient function, we need to use as many distinct primes as possible.
	 * This is accomplished by using primorial(pretty much factorial for primes).
	 * So the maximum of n / phi(n) is the product of all primes where the product is less than n.
	 */
}
