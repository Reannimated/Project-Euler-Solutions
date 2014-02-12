//Run Time: 22ms
import regy.library;
public class p010 {

	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		boolean[] primes = library.sieveOfEratosthenes(1999999); 
		long result=0;
		for(int i=1;i<primes.length;i++) {
			if(primes[i])
				result+=i;
		}
		System.out.println(result);
		System.out.println(System.currentTimeMillis()-start+"ms");
	}
}
