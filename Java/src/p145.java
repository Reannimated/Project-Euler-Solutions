//Run Time: 57580
import regy.library;

public class p145 {

	public static String run() {
		int count = 0;
		for(int n = 10; n < 1000000000; n++) {
			if(reversible(n))
				count++;
		}
        return Integer.toString(count);
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
