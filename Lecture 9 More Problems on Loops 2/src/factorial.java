import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int prod=1;
        for (int i=2;i<=num;i++){
            prod*=i;
        }
        System.out.println(prod);
    }
}
