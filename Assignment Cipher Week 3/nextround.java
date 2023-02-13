import java.util.*;

public class nextround {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        int res = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (arr[0] <= 0) {
            System.out.println(0);
        }

        else {

            k = k - 1;

            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] < arr[k] || arr[i] == 0) {
                    res++;
                } else {
                    break;
                }
            }

            System.out.println(n - res);
        }

    }
}
