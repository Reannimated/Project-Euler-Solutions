//Run Time: 
import regy.library;

public class p038 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int result=0,temp;
		for(int i=9000;i<10000;i++)
		{
			temp = concentrate(i,2*i);
			if(library.isPandigital(temp))
				if(temp>result)
					result=temp;
		}
		System.out.println(result);
		System.out.println(System.currentTimeMillis()-start+"ms");
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
