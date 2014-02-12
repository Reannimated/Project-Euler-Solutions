//Run Time: 3ms
public class p039 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int result=0,maxSolutions=0;
		for (int p = 2; p <= 1000; p += 2)
		{
			int count = 0;
			for (int a = 2; a < (p/3); a++)
			{
				if(p*(p-2*a) % (2*(p-a)) == 0)
				{
					count++;
				}
			}
			if(count > maxSolutions)
			{
				maxSolutions = count;
				result = p;
			}
		}
		System.out.println(result);
		System.out.println(System.currentTimeMillis()-start+"ms");
	}

}
