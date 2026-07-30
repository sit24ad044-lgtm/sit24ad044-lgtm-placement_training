import java.util.Scanner;
public class leftrot {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int sum = 0;
        int i;
        for(i =0;i<n;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int min =arr[0],max =arr[0];
        for(i =0;i<n;i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];


        }
            System.out.print("min = "+ min);
            System.out.print("max= "+max);
            System.out.print("sum= "+ sum);
            System.out.print("average= "+sum/n);
        }

    }

