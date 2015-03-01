//Run Time: 172ms
import regy.library;
public class p036 {
	public static String run() {
		int result=0;
		for(int i=0;i<1000000;i++){
			if(library.isPalindrome(i))
				if(baseTwoPalindrome(i))
					result+=i;
		}
        return Integer.toString(result);
	}

	private static boolean baseTwoPalindrome(int j) {
		String num = Integer.toBinaryString((Integer)j);
		if(library.isPalindrome(num))
			return true;
		else 
			return false;
	}	
}
