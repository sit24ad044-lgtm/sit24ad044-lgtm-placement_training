import java.util.Scanner;
public class COMPLETEDAYS_REMDAYS {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int d = sc.nextInt();
            int m = sc.nextInt();
            int y = sc.nextInt();

            int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

            if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0))
                days[1] = 29;

            int completed = d;

            for (int i = 0; i < m - 1; i++)
                completed += days[i];

            int total = (days[1] == 29) ? 366 : 365;

            System.out.println("Completed Days = " + completed);
            System.out.println("Remaining Days = " + (total - completed));
        }

}
