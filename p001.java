//Run Time: 0ms
public class p001
{
	public static void main(String[] args)
	{
		int result=0,i=0;
		long start = System.currentTimeMillis();
		while(i<1000)
		{
			if(i%3==0||i%5==0)
				result+=i;
			i++;
		}
		System.out.println(result);
		System.out.println(System.currentTimeMillis()-start+"ms");
	}
}
