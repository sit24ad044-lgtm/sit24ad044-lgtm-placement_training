import java.util.Scanner;
public class adam_num {

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int rev = 0, temp = n;

            while (temp > 0) {
                rev = rev * 10 + temp % 10;
                temp /= 10;
            }

            int sq1 = n * n;
            int sq2 = rev * rev;

            int revsq = 0;

            while (sq2 > 0) {
                revsq = revsq * 10 + sq2 % 10;
                sq2 /= 10;
            }

            if (sq1 == revsq)
                System.out.println("Adam Number");
            else
                System.out.println("Not Adam Number");
        }
    }

