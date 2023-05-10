import java.util.Scanner;

public class Binary_to_Decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        int power=1;
        while (n>0){
            int rem=n%10;
            ans+=power*rem;
            power*=2;
            n/=10;
        }
        System.out.println(ans);
    }
}
