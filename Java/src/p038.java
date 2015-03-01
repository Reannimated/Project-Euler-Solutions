//Run Time: 2ms
import regy.library;
public class p038 {
	public static String run() {
		int result=0,temp;
		for(int i=9000;i<10000;i++)
		{
			temp = concentrate(i,2*i);
			if(library.isPandigital(temp))
				if(temp>result)
					result=temp;
		}
        return Integer.toString(result);
	}

	private static int concentrate(int a, int b) 
	{
		int c = b;
		while (c > 0) {
			a *= 10;
			c /= 10;
		}
		return a + b;
	}
}
