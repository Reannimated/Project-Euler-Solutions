//Run Time: 278ms
//Optimized Run Time: 12ms
import library.library;
public class p012 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int result=0,i=1;
		int[] primes = library.primeList(50);
		//Unoptimized Solution: uses trial division
//		while(library.numberOfDivisors(result)<500)
//		{
//			result+=i;
//			i++;
//		}
		while(library.primeFactorizationNOD(result,primes)<500)
		{
			result+=i;
			i++;
		}
		System.out.println(result);
		System.out.println(System.currentTimeMillis()-start+"ms");
	}

}
