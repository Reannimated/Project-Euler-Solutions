
public class p026 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		System.out.println(System.currentTimeMillis()-start+"ms");
	}

	private int recurringCycleLength(int n){
		int cycleLength=0;
		while(n%2==0)
			n/=2;
		while(n%5==0)
			n/=5;
		if(n>1){
			int a=10%n;
			cycleLength=1;
			while(a!=1){
				a*=10;
				a%=n;
				cycleLength+=1;
			}
		}
		return cycleLength;
	}
}
