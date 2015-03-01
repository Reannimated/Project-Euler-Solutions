//Run Time: 65ms
import regy.library;
public class p027 {
	public static String run() {
		int result=0;
		int maxnum=0,maxa=0,maxb=0;
		for(int a=-1000;a<=1000;a++){
				for(int b=-1000;b<=1000;b++){
					int temp = numberOfPrimes(a,b);
					if(temp>maxnum){
						maxnum=temp;
						maxa=a;
						maxb=b;
					}
				}
			}
		result=maxa*maxb;
        return Integer.toString(result);
	}

	private static int numberOfPrimes(int a, int b){
		for (int i = 0; ; i++) {
			int n = i * i + i * a + b;
			if (n < 0 || !library.isPrime(n))
				return i;
		}
	}	
}
