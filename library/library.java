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
}
