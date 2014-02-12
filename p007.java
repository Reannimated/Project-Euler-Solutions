//Run Time: 16ms
import regy.library;
public class p007 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int i=3,primes=1;
		while(primes<10001) {
			if(library.isPrime(i))
				primes++;
			i++;
		}
		System.out.println(i-1);
		System.out.println(System.currentTimeMillis()-start+"ms");
	}

}
