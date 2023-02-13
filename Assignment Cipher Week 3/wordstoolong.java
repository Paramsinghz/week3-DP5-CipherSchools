import java.util.*;

public class wordstoolong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- >= 0) {

            String str = sc.nextLine();
            int count = 0;

            if (str.length() <= 10)
                System.out.println(str);

            else {

                for (int i = 1; i < str.length() - 1; i++) {
                    count++;
                }

                System.out.println(str.charAt(0) + "" + count + "" + str.charAt(str.length() - 1));

            }

        }
    }
}
