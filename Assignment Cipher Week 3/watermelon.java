import java.util.*;

public class watermelon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();

        if (t > 100 || t < 1)
            System.out.println("Invalid Input");
        else if (t % 2 == 0) {
            if (t == 2)
                System.out.println("NO");
            else
                System.out.println("YES");
        } else
            System.out.println("NO");
        sc.close();
    }
}
