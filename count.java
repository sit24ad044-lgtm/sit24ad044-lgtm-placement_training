import javax.lang.model.util.ElementScanner14;
import java.util.Scanner;
public class count {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int[] a = {1,2,2,3,4,4,5,6,2,2,4,5,6,};
        int key = sc.nextInt();
        int count = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]==key)
                count++;
        }
        System.out.print(count);
    }
}
