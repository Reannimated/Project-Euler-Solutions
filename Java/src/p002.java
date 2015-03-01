//Run Time: 0ms
public class p002 {
	public static String run() {
		int result = 0;
		int a = 0,b = 1,c; //c is the nth fibonacci number, b is the n-1th fibonacci number and a is the n-2th fibonacci number
		while(b < 4000000) {
			c = a + b;
			a = b;
			b = c;
			if(b % 2 == 0)
				result += b;
		}
        return Integer.toString(result);
	}
}
