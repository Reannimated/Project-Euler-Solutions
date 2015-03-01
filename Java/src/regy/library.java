package regy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class library {

	//Returns the reverse of a string. e.g. hello will return olleh
	public static String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}

	//Returns the reverse of a integer. e.g. 3419 will return 9143
	public static int reverse(int n) {
		return Integer.parseInt(new StringBuilder(Integer.toString(n)).reverse().toString());
	}

	public static BigInteger reverse(BigInteger n) {
		return new BigInteger(reverse(n.toString()));
	}

	//Returns true if the string reads the same forwards and backwards
	public static boolean isPalindrome(String s) {
		return s.equals(reverse(s));
	}

	//Returns true if the integer reads the same forwards and backwards
	public static boolean isPalindrome(int x) {
		return isPalindrome(Integer.toString(x));
	}

	//Returns the number of digits in a integer e.g. 164563 will return 6
	public static int numberOfDigits(int n) {
		return (int) Math.floor(Math.log10(n)+1);
	}

	public static int numberOfDigits(int a, int b) {
		return (int) Math.floor(1 + b * Math.log10(a));
	}

	//Uses trial division(1 to sqrt(n)) to verify that n is prime
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

	//Uses the Sieve of Eratosthenes to create a boolean array of values from 1 to n. If a value is true, it is prime
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
	//Uses the Sieve of Eratosthenes to create a list of prime integers from 1 to n
	public static int[] primeList(int n) {
		if(n<0)
			throw new IllegalArgumentException("Negative Value");
		boolean[] boolPrime = sieveOfEratosthenes(n);
		int count = 0;
		for (boolean a : boolPrime) {
			if (a)
				count++;
		}
		int[] primes = new int[count];
		for (int i = 0, j = 0; i < boolPrime.length; i++) {
			if (boolPrime[i])
				primes[j++] = i;
		}
		return primes;
	}

	//Returns the number of divisors a number has. e.g. inputing 28 would return 6
	public static int numberOfDivisors(int n) {
		int divisors = 0;
		int sqr = (int)Math.sqrt(n);
		for(int i = 1; i<= sqr; i++){
			if(n % i == 0){
				divisors += 2;
			}
		}
		if (sqr * sqr == n) {
			divisors--;
		}

		return divisors-1;
	}

	//Returns an array of integers with the distinct prime factors of the integer n.
	public static int[] distinctPrimeFactors(int n) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for(int i = 2; i <= (int)Math.sqrt(n); i++) {
			if (n % i == 0) {
				while(n %i == 0) {
					n /= i;
				}
				factors.add(i);
			}
		}
		if(n != 1)
			factors.add(n);
		int[] temp = new int[factors.size()];
		for(int i = 0; i < temp.length; i++) {
			temp[i] = factors.get(i);
		}
		return temp;
	}
	
	//Returns an array of integers with the prime factors and its frequency of the integer n
	public static int[] primeFactors(int n) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for(int i = 2; i <= (int)Math.sqrt(n); i++) {
			if (n % i == 0) {
				int ct = 0;
				while(n %i == 0) {
					n /= i;
					ct++;
				}
				factors.add(i);
				factors.add(ct);
			}
		}
		if(n != 1) {
			factors.add(n);
			factors.add(1);
		}
		int[] temp = new int[factors.size()];
		for(int i = 0; i < temp.length; i++) {
			temp[i] = factors.get(i);
		}
		return temp;
	}
	
	//Uses prime factorization to return the number of divisors of a number
	public static int primeFactorizationNOD(int n, int[] primes) {
		int nod=1;
		int exponent;
		int remain = n;

		for (int i = 0; i < primes.length; i++) {
			if (primes[i] * primes[i] > n) {
				return nod * 2;
			}

			exponent = 1;
			while (remain % primes[i] == 0) {
				exponent++;
				remain /= primes[i];
			}
			nod *= exponent;
			if (remain == 1) {
				return nod;
			}
		}
		return nod;
	}

	//Returns n! e.g. 6! will return 720
	public static BigInteger factorial(int n) {
		if (n < 0)
			throw new IllegalArgumentException("Negative Value");
		BigInteger num = BigInteger.ONE;
		for (int i = 2; i <= n; i++)
			num = num.multiply(BigInteger.valueOf(i));
		return num;
	}

	//Returns true if number contains the digits 0 to length of n
	public static boolean isPandigital(int n){
		int digits = 0;
		int count = 0;
		int temp;
		while (n > 0) {
			temp = digits;
			digits = digits | 1 << (int)((n % 10) - 1);
			if (temp == digits) {
				return false;
			}

			count++;
			n /= 10;
		}
		return digits == (1 << count) - 1;
	}

	//Returns true if an array has a next permutation and performs it.
	public static boolean hasNextPermutation(int[] a) {
		int largestIndexJ = -1;
		for (int i = a.length - 2; i >= 0; i--)
		{
			if (a[i] < a[i + 1])
			{
				largestIndexJ = i;
				break;
			}
		}

		if (largestIndexJ < 0)
			return false;

		int largestIndexL = -1;
		for (int i = a.length - 1; i >= 0; i--)
		{
			if (a[largestIndexJ] < a[i])
			{
				largestIndexL = i;
				break;
			}
		}

		int temp = a[largestIndexJ];
		a[largestIndexJ] = a[largestIndexL];
		a[largestIndexL] = temp;

		for (int i = largestIndexJ + 1, j = a.length - 1; i < j; i++, j--)
		{
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}

		return true;
	}

    public static ArrayList<String> permutation(String s) {
        // The result
        ArrayList<String> res = new ArrayList<String>();
        // If input string's length is 1, return {s}
        if (s.length() == 1) {
            res.add(s);
        } else if (s.length() > 1) {
            int lastIndex = s.length() - 1;
            // Find out the last character
            String last = s.substring(lastIndex);
            // Rest of the string
            String rest = s.substring(0, lastIndex);
            // Perform permutation on the rest string and
            // merge with the last character
            res = merge(permutation(rest), last);
        }
        return res;
    }

    public static ArrayList<String> merge(ArrayList<String> list, String c) {
        ArrayList<String> res = new ArrayList<String>();
        // Loop through all the string in the list
        for (String s : list) {
            // For each string, insert the last character to all possible postions
            // and add them to the new list
            for (int i = 0; i <= s.length(); ++i) {
                String ps = new StringBuffer(s).insert(i, c).toString();
                res.add(ps);
            }
        }
        return res;
    }

	//Returns true if the two integers are permutations
	public static boolean isPermutation(int i, int j) {
		char[] a = Integer.toString(i).toCharArray();
		char[] b = Integer.toString(j).toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a, b))
			return true;
		return false;
	}

	//Returns n choose k
	public static BigInteger combination(int n, int k) {
		return factorial(n).divide(factorial(n - k).multiply(factorial(k)));
	}

	//Returns the sum of digits of a number
	public static int sumOfDigits(int n) {
		int sum = 0;
		while (n != 0)
		{
			sum += (n % 10);
			n /= 10;
		}
		return sum;
	}

	public static int sumOfDigits(BigInteger num) {
		int sum = 0;
		String s = num.toString();
		for (int i = 0; i < s.length(); i++)
			sum += s.charAt(i) - '0';
		return sum;
	}

	//Return the greatest common divisor of a and b
	public static int gcd(int a, int b) {
		while (b != 0) {
			int c = a % b;
			a = b;
			b = c;
		}
		return a;
	}

	//Returns the number of integers below n that are relatively prime to n
	public static int totient(int n) {
		double result = n;
		int[] factors = distinctPrimeFactors(n);
		for(int i = 0; i < factors.length; i++) {
			result *=  (1 - (double)1/factors[i]);
		}
		return (int)Math.round(result);
	}
	
	public static int primorial(int n) {
		int[] primes = primeList(n);
		int result = 1;
		for(int i = 0; result * primes[i] < n; i++) {
			result *= primes[i];
		}
		return result;
	}
}
