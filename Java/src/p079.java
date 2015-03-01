//Run Time: 1ms
import java.util.Arrays;

public class p079 {

    private static int[] logins = {319, 680, 180, 690, 129, 620, 762, 689, 762, 318, 368, 710, 720, 710, 629, 168, 160, 689, 716, 731, 736, 729, 316, 729, 729, 710, 769, 290, 719, 680, 318, 389, 162, 289, 162, 718, 729, 319, 790, 680, 890, 362, 319, 760, 316, 729, 380, 319, 728, 716};

    public static String run() {
        int[] index = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] digits = new int[10];
        int[] usage = new int[10];
        Arrays.fill(digits, -1);
        for(int i = 0; i < logins.length; i++) {
            digits[logins[i] / 100] += 100;
            usage[logins[i] / 100]++;
            digits[logins[i] % 100 / 10] +=50;
            usage[logins[i] % 100 / 10]++;
            digits[logins[i] % 10] += 1;
            usage[logins[i] % 10]++;
        }
        for(int i = 0; i < digits.length; i++) {
            if(usage[i] != 0)
                digits[i] /= usage[i];
        }
        quicksort(digits, index);
        String result = "";
        for(int i = 0; i < digits.length; i++) {
            if (digits[i] != -1)
                result += index[i];
        }
        return result;
    }

    public static void quicksort(int[] main, int[] index) {
        quicksort(main, index, 0, index.length - 1);
    }

    // quicksort a[left] to a[right]
    public static void quicksort(int[] a, int[] index, int left, int right) {
        if (right <= left) return;
        int i = partition(a, index, left, right);
        quicksort(a, index, left, i-1);
        quicksort(a, index, i+1, right);
    }

    // partition a[left] to a[right], assumes left < right
    private static int partition(int[] a, int[] index,
                                 int left, int right) {
        int i = left - 1;
        int j = right;
        while (true) {
            while (a[++i] > a[right])      // find item on left to swap
                ;                               // a[right] acts as sentinel
            while (a[right] > a[--j])      // find item on right to swap
                if (j == left) break;           // don't go out-of-bounds
            if (i >= j) break;                  // check if pointers cross
            swap(a, index, i, j);               // swap two elements into place
        }
        swap(a, index, i, right);               // swap with partition element
        return i;
    }

    // exchange a[i] and a[j]
    private static void swap(int[] a, int[] index, int i, int j) {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
        int b = index[i];
        index[i] = index[j];
        index[j] = b;
    }
}
