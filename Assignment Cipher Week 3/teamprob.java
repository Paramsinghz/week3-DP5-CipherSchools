import java.util.*;

public class teamprob {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int sum = 0, res = 0;

        while (t-- > 0) {
            sum = 0;
            int arr[] = new int[3];

            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < 3; i++) {
                sum += arr[i];
            }
            if (sum >= 2) {
                res++;
            }
        }

        System.out.println(res);
    }

}
