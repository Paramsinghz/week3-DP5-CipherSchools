import java.util.*;
import java.math.*;

public class ropecut {

    public static int cuts(int n, int a, int b, int c) {

        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return -1;
        }

        int max = Math.max(cuts(n - a, a, b, c),
                Math.max(cuts(n - b, a, b, c),
                        cuts(n - c, a, b, c)));

        if (max == -1)
            return -1;
        return max;

    }

    public static void main(String[] args) {
        int n = 22, a = 11, b = 9, c = 12;
        System.out.println(cuts(n, a, b, c));

    }
}
