//Run Time: 0ms
public class p003
{

	public static void main(String[] args)
	{
		long number = 600851475143L;
		long start = System.currentTimeMillis();
		int i = 0;
		for (i = 2; i <= number; i++)
		{
			if (number % i == 0)
			{
				number /= i;
				i--;
			}
		}
		System.out.println(i);
		System.out.println(System.currentTimeMillis()-start+"ms");
	}

}