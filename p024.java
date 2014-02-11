//Run Time: 909ms
import java.util.ArrayList;

public class p024 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		ArrayList<String> perms = new ArrayList<String>();
		nthpermutation("", "0123456789", perms,1000000);
		System.out.println(perms.get(999999));
		System.out.println(System.currentTimeMillis()-start+"ms");
	}

	private static void nthpermutation(String prefix, String str,ArrayList<String> perm,int n) {
		int a = str.length();
		if (a == 0)
			perm.add(prefix);
		else {
			for (int i = 0; i < a; i++){
				if(perm.size()>=n)
					break;
				nthpermutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, a), perm,n);
			}
		}
	}
}
