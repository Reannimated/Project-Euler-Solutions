//Run Time: 13ms
public class p021 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int result=0;
		for(int i=2;i<10000;i++)
		{
			if(isAmicable(i))
				result+=i;
		}
		System.out.println(result);
		System.out.println(System.currentTimeMillis()-start+"ms");
	}

	public static boolean isAmicable(int a)
	{
		int da = sumOfDivisors(a);   
		int db = sumOfDivisors(da);  
		if(da==db)
			return false;
		if(a==db)
			return true;
		return false;
	}

	public static int sumOfDivisors(int n)
	{
		int sum=0;
		for(int i=1;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				sum+=i;
				if(i!=Math.sqrt(n))
					sum+=(n/i);
			}
		}
		return sum-n;
	}

}
