//Run Time: 0ms
public class p001 {
    public static String run() {
        int result = 0, i = 0;
        while(i < 1000) {
            if(i % 3 == 0 || i % 5 == 0)
                result += i;
            i++;
        }
        return Integer.toString(result);
    }
}
