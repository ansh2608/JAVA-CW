import java.util.Scanner;

public class Assignment_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int i=1;i*i<=num;i++){
            System.out.print(i*i+" ");
        }
    }
}
