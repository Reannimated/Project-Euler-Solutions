import library.library;
public class main
{

	public static void main(String[] args) {
		int[] primes = library.primeList(100);
		int a=0;
		for(int i=0;i<primes.length;i++) {
			System.out.println(primes[i]);
		}
	}

}
