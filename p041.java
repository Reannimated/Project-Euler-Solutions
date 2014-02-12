//Run Time: 86ms
import java.util.Arrays;
import java.util.HashSet;
import regy.library;

public class p041 {

	static HashSet<String> num = new HashSet<String>();
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		int result=0;
		permutation("","1234567");
		String set[] = new String[num.size()];
		int set1[] = new int[num.size()];
		num.toArray(set);
		for(int i=0;i<set.length;i++){
			if(Integer.parseInt(set[i])%2==0)
				set1[i]=0;
			else
				set1[i]=Integer.parseInt(set[i]);
		}
		Arrays.sort(set1);
		for(int i=0;i<set1.length;i++){
			if(library.isPrime(set1[i])){
				if(set1[i]>result)
					result=set1[i];
			}
		}
		System.out.println(result);
		System.out.println(System.currentTimeMillis()-start+"ms");
	}
	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0)
	    	num.add(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	           permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}

}
