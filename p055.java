//Run Time: 228ms
import regy.library;
import java.math.BigInteger;

public class p055 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int result = 0;
		for(int n = 1; n < 10000; n++) {
			if(isLychrel(n))
				result++;
		}
		System.out.println(result);
		System.out.println(System.currentTimeMillis() -  start + "ms");
	}
	
	private static boolean isLychrel(int n) {
		BigInteger num = BigInteger.valueOf(n);
		for(int i = 0; i < 50; i++) {
			num = num.add(library.reverse(num));
			if(library.isPalindrome(num.toString()))
				return false;
		}
		return true;
	}

}
