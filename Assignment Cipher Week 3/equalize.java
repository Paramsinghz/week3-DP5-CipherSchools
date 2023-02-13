import java.util.*;

public class equalize {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- >= 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int y = 0;

            for (int i = 0; i < n; i++) {
                int x = (int) (Math.sqrt(arr[i]));

                if (x * x != arr[i]) {
                    y = 1;
                    break;
                }
            }

            if (y != 1) {
                System.out.println("NO");
            } else
                System.out.println("YES");

        }
    }
}
