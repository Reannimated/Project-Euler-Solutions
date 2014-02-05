//Run Time: 0ms
public class p006 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int result=0,square=0,sum=0;
		for(int i=1;i<=100;i++)
			square+=i*i;
		for(int j=1;j<=100;j++)
			sum+=j;
		sum*=sum;
		result=sum-square;
		System.out.println(result);
		System.out.println(System.currentTimeMillis()-start+"ms");
	}

}
