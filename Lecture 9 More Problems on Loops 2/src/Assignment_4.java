import java.util.Scanner;

public class Assignment_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int num=1;num<a;num++){
            int t=num;
            int sum=0;
            int count =0;
            while (num>0){
                count++;
                num/=10;
            }
            num=t;
            while(num>0){
                int r=num%10;
                sum+=Math.pow(r,count);
                num/=10;
            }
            num=t;
            if (t==sum){
                System.out.println(num);
            }
        }
    }
}
