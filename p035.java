//Run Time: 98ms
import regy.library;
public class p035 {

	static boolean[] primes = library.sieveOfEratosthenes(999999);
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int result=1;
		int max=1000000;
		for(int i=3;i<max;i+=2)
		{
			if(primeRotations(i))
				result++;
		}
		System.out.println(result);
		System.out.println(System.currentTimeMillis()-start+"ms");
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
