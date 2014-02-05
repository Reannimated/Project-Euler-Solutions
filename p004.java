//Run Time: 35ms
import library.library;
public class p004 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int result=0;
		for(int i=900;i<1000;i++) {
			for(int j=900;j<1000;j++) {
				if(library.isPalindrome(i*j))
					if(i*j>result)
						result=i*j;
			}
		}
		System.out.println(result);
		System.out.println(System.currentTimeMillis()-start+"ms");
	}

}
