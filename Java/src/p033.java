//Run Time: 0ms
public class p033 {
	public static String run() {
		int result=0;
		int denominator=1;
		int numerator=1;
		for(int i=0;i<10;i++){
			for(int b=0;b<i;b++){
				for(int a=0;a<b;a++){
					if(b*(10*a+i)==a*(10*i+b)){
						numerator*=a;
						denominator*=b;
					}
				}
			}
		}
		result=denominator/GCD(numerator, denominator);
        return Integer.toString(result);
	}

	private static int GCD(int u, int v) {
		while ( v != 0) {
			int r = u % v;
			u = v;
			v = r;
		}
		return u;
	}
}
