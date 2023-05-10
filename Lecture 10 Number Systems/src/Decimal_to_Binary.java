import java.util.Scanner;

public class Decimal_to_Binary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        int pow=1;
        while (n>0){
            int rem=n%2;
            ans+=pow*rem;
            pow*=10;
            n/=2;
        }
        System.out.println(ans);
    }
}
