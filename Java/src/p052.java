//Run Time: 66ms
import regy.library;
public class p052 {
	public static String run() {
		boolean perm = false;
		int x = 2;
		while(!perm) {
			int n=2;
			perm = true;
			while(perm) {
				if(n > 6)
					break;
				if(!library.isPermutation(x, n*x))
					perm = false;
				n++;
			}
			x++;
		}
		return Integer.toString(x-1);
	}
}
