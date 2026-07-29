import java.util.Scanner;
public class amicable_pair {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();

            int s1 = 0, s2 = 0;

            for (int i = 1; i < a; i++)
                if (a % i == 0)
                    s1 += i;

            for (int i = 1; i < b; i++)
                if (b % i == 0)
                    s2 += i;

            if (s1 == b && s2 == a)
                System.out.println("Amicable Pair");
            else
                System.out.println("Not Amicable Pair");
        }
    }

