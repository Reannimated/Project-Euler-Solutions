package library;

import java.util.*;

public class library 
{
	public static String reverse(String s)
	{
		return new StringBuilder(s).reverse().toString();
	}
	
	public static boolean isPalindrome(String s)
	{
		return s.equals(reverse(s));
	}
	
	public static boolean isPalindrome(int x)
	{
		return isPalindrome(Integer.toString(x));
	}
<<<<<<< HEAD

	public static boolean isPrime(int n) {
		if (n < 0)
			throw new IllegalArgumentException("Negative Value");
		if (n == 0 || n == 1)
			return false;
		else if (n == 2)
			return true;
		else {
			if (n % 2 == 0)
				return false;
			for (int i = 3; i <= Math.sqrt(n); i += 2) {
				if (n % i == 0)
					return false;
			}
			return true;
		}
	}

	public static boolean[] sieveOfEratosthenes(int n) {
		if(n < 0)
			throw new IllegalArgumentException("Negative Value");
		boolean[] primes = new boolean[n + 1];
		if(n>2) {
			primes[2]=true;
			for(int i=3;i<primes.length-1;i+=2) {
				primes[i]=true;
			}
			for(int i=2;i<=Math.sqrt(n);i++)
			{
				if(primes[i])
				{
					for(int j=2;i*j<n;j++)
					{
						primes[i*j]=false;
					}
				}
			}
		}
		return primes;
	}

=======
>>>>>>> parent of e42fbee... Problems 5 and 6
}
