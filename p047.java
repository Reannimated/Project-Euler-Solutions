//Run Time: 169ms
public class p047 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int result=0;
		for(int i=2; ;i++) {
			if(distinctPF(i)==4 && distinctPF(i+1)==4 && distinctPF(i+2)==4 && distinctPF(i+3)==4) {
				result = i;
				break;
			}
		}
		System.out.println(result);
		System.out.println(System.currentTimeMillis()-start+"ms");
	}
	private static int distinctPF(int n) {
		int count=0;
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n%i==0) {
				while(n%i==0)
					n/=i;
				count++;
			}
		}
		if(n>1)
			count++;
		return count;
	}
}
