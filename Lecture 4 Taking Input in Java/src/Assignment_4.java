import java.util.Scanner;

public class Assignment_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int i=0;i<num;i++){
            int a=sc.nextInt();
            int b= sc.nextInt();
            int sum=a+b;
            System.out.println(sum);
        }
    }
}
