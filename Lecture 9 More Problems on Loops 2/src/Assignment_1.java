import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        int b=1;
        int sum=0;
        for (int i=1;i<=n;i++){
            System.out.print(a+" ");
            sum=a+b;
            a=b;
            b=sum;
        }
    }
}
