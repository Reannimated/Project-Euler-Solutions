//Run Time: 278ms
//Optimized Run Time: 12ms
import regy.library;
public class p012 {
	public static String run() {
		int result = 0, i = 1;
		int[] primes = library.primeList(50);
		while(library.primeFactorizationNOD(result,primes)<500)
		{
			result+=i;
			i++;
		}
		return Integer.toString(result);
	}
    //Unoptimized Solution: uses trial division
    public static int runOld() {
        int result = 0, i = 1;
        int[] primes = library.primeList(50);
		while(library.numberOfDivisors(result)<500)
		{
			result+=i;
			i++;
		}
        return result;
    }
}
