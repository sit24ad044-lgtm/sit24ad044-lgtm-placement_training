import java.util.Scanner;
public class armstrong_number {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int temp = n, sum = 0;

            while (n > 0) {
                int d = n % 10;
                sum += d * d * d;
                n /= 10;
            }

            if (sum == temp)
                System.out.println("Armstrong Number");
            else
                System.out.println("Not Armstrong Number");
        }
    }

