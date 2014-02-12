import regy.library;
public class p036 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int result=0;
		for(int i=0;i<1000000;i++){
			if(library.isPalindrome(i))
				if(baseTwoPalindrome(i))
					result+=i;
		}
		System.out.println(result);
		System.out.println(System.currentTimeMillis()-start+"ms");
	}

	private static boolean baseTwoPalindrome(int j) {
		String num = Integer.toBinaryString((Integer)j);
		if(library.isPalindrome(num))
			return true;
		else 
			return false;
	}	
}
