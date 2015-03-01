//Run Time: 98ms
import regy.library;
public class p035 {
	static boolean[] primes = library.sieveOfEratosthenes(999999);
	public static String run() {
		int result=1;
		int max=1000000;
		for(int i=3;i<max;i+=2)
		{
			if(primeRotations(i))
				result++;
		}
        return Integer.toString(result);
	}

	private static boolean primeRotations(int num)
	{
		int start = num;
		if(!primes[num])
			return false;
		else if(num<10&&primes[num])
			return true;
		do{
			num = Integer.parseInt(Integer.toString(num%10)+Integer.toString(num/10));
			if(num%2==0)
				return false;
			else if(!primes[num])
				return false;
		}while(num!=start);
		return true;
	}
}
