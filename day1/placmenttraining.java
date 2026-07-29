import java.util.Scanner;
class Greatest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a >= b && a >= c)
            System.out.println("Greatest num = "+ a);
        else if(b>= c)
            System.out.println("Greatest num = "+ b);
        else
            System.out.println("Greatest num = " + c);
    }
}
