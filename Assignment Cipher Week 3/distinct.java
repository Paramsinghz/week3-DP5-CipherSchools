import java.util.*;

public class distinct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            ArrayList<Long> arr = new ArrayList<>();
            HashMap<Long, Boolean> check = new HashMap<>();

            Long max = 0L, min = 0L, ans = 0L;

            for (int i = 0; i < n; i++) {
                arr.add(sc.nextLong());
            }

            for (int i = 0; i < arr.size(); i++) {
                max = Math.max(max, arr.get(i));
                check.put(arr.get(i), true);
            }

            while (k-- > 0) {
                max = Math.max(max, min);

                min = 0L;

                while (check.containsKey(min)) {
                    min++;
                }

                if ((min + max) % 2 == 0) {
                    ans = (min + max) / 2;
                } else {
                    ans = ((max + min) / 2) + 1;
                }

                if (!check.containsKey(ans)) {
                    arr.add(ans);
                    check.put(ans, true);
                }

            }

            System.out.println(arr.size());
        }
    }
}
