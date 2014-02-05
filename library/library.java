package library;

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

	public static boolean isPrime(int n) {
		if(n<0)
			throw new IllegalArgumentException("Negative Value");
		if(n==0||n==1)
			return false;
		else if(n==2)
			return true;
		else {
			if(n%2==0)
				return false;
			for(int i=1;i<Math.sqrt(n);i+=2) {
				if(i%n==0)
					return false;
			}
			return true;
		}
	}
}
