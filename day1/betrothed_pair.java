import java.util.Scanner;
public class betrothed_pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();

                int s1 = 0, s2 = 0;

                for (int i = 2; i < a; i++)
                    if (a % i == 0)
                        s1 += i;

                for (int i = 2; i < b; i++)
                    if (b % i == 0)
                        s2 += i;

                if (s1 == b + 1 && s2 == a + 1)
                    System.out.println("Betrothed Pair");
                else
                    System.out.println("Not Betrothed Pair");
            }
        }