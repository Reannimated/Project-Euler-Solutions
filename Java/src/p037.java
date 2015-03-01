//Run Time: 5ms
import regy.library;
public class p037 {
	static boolean[] primes=library.sieveOfEratosthenes(1000000);
	public static String run() {
		int result=0;
		int count=0;
		int num=21;
		while(count<11)
		{
			if(primes[num])
				if(isTruncatablePrime(num))
				{
					result+=num;
					count++;
				}

			num+=2;
		}
        return Integer.toString(result);
	}

	private static boolean isTruncatablePrime(int num)
	{
		int i=num,n=10;
		while(i>0)
		{
			if (!primes[i])
				return false;
			i/=10;
		}
		if(library.isPalindrome(num))
			return true;
		i=num;
		while(n<i)
		{
			if (!primes[i%n])
				return false;
			n*=10;
		}
		return true;
	}
}
