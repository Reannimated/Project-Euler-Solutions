//Run Time: 909ms
import java.util.ArrayList;
public class p024 {

	public static String run() {
		ArrayList<String> perms = new ArrayList<String>();
		nthpermutation("", "0123456789", perms,1000000);
		return perms.get(999999);
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
