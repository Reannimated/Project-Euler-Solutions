//Run Time: 3ms
public class p026 {
	public static String run() {
		int result=0,temp1;
		for(int i=3;i<1000;i++){
			temp1 = recurringCycleLength(i);
			if(temp1>result)
				result=i;
		}
        return Integer.toString(result);
	}

	private static int recurringCycleLength(int n){
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
