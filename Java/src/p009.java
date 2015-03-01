//Run Time: 5ms
public class p009 {
    public static String run() {
        int result = 0;
        for (int a = 1; a < 1000; a++) {
            for (int b = 1; b < 1000; b++) {
                int c = 1000 - a - b;
                if (a * a + b * b == c * c)
                    result = a * b * c;
            }
        }
        return Integer.toString(result);
    }
}
