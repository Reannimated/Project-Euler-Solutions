//Run Time: 35ms
import regy.library;
public class p004 {
	public static String run() {
		int result = 0;
		for(int i = 900; i < 1000; i++) {
			for(int j = 900; j < 1000; j++) {
				if(library.isPalindrome(i * j))
					if(i * j > result)
						result = i * j;
			}
		}
		return Integer.toString(result);
	}
}
