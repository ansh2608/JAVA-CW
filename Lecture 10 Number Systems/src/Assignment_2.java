import java.util.Scanner;

public class Assignment_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        int pow=1;
        while (n>0){
            int rem=n%10;
            ans+=pow*rem;
            pow*=2;
            n/=10;
        }
        System.out.println(ans);
    }
}
