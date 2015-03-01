//Run Time: 3ms
public class p039 {
	public static String run() {
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
        return Integer.toString(result);
	}
}
