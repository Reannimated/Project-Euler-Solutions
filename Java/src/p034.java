//Run Time: 54ms
public class p034 {
	public static String run() {
		int result=0;
		for(int i=3;i<100000;i++){
			if(digitFactorials(i))
				result+=i;
		}
        return Integer.toString(result);
	}

	private static boolean digitFactorials(int num){
		int digitFac=0;
		int temp;
		String num1 = Integer.toString(num);
		for(int i=0;i<num1.length();i++){
			temp=Integer.parseInt(num1.substring(i,i+1));
			digitFac+=factorial(temp);
		}
		if(digitFac==num)
			return true;
		else
			return false;
	}
	
	private static int factorial(int n) {
		int fac=1;
		if(n==0)
			return 1;
		for(int i=2;i<=n;i++) {
			fac*=i;
		}
		return fac;
	}
}
