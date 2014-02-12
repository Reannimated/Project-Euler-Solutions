//Run Time: 441ms
import java.util.HashSet;
import java.util.Set;

import regy.library;

public class p032 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int result=0;
		Set<Integer> products = new HashSet<Integer>();
		for(int a=0;a<1964;a++)
		{
			for(int b=0;b<a;b++)
			{
				String num = Integer.toString(a)+Integer.toString(b)+Integer.toString(a*b);
				if(num.length()==9&&library.isPandigital(Integer.parseInt(num)))
				{
					products.add(a*b);
				}
			}
		}
		for(int i:products)
			result+=i;
		System.out.println(result);
		System.out.println(System.currentTimeMillis()-start+"ms");
	}
}