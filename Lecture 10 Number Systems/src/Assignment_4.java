import java.util.Scanner;

public class Assignment_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter decimal no.: ");
        int n1=sc.nextInt();
        System.out.print("Enter binary no.: ");
        int n2=sc.nextInt();
        int ans=0;
        int pow=1;
        while (n2>0){
            int rem=n2%10;
            ans+=pow*rem;
            pow*=2;
            n2/=10;
        }
        int sum=ans*n1;
        System.out.println(sum);
    }
}
