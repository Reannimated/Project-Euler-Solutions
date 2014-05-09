//Run Time: 57580
import regy.library;
public class p145 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int count = 0;
		for(int n = 10; n < 1000000000; n++) {
			if(reversible(n))
				count++;
		}
		System.out.println(count);
		System.out.println(System.currentTimeMillis() - start + "ms");
	}
	
	private static boolean reversible(int n) {
		int length = library.numberOfDigits(n);
		if(n % 10 == 0 || length == 5 || length == 9)
			return false;
		n += library.reverse(n);
	    while (n > 0) {
	        if ((n % 10) % 2 == 0)
	        	return false;
	        n /= 10;
	    }
	    return true;
	}
}
