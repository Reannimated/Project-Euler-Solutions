//Run Time: 0ms
import library.library;
public class p004
{

	public static void main(String[] args)
	{
		int result=0;
		long start = System.currentTimeMillis();
		for(int i=100;i<1000;i++)
		{
			for(int j=100;j<1000;j++)
			{
				if(library.isPalindrome(i*j))
					if(i*j>result)
						result=i*j;
			}
		}
		System.out.println(result);
		System.out.println(System.currentTimeMillis()-start+"ms");
	}

}
