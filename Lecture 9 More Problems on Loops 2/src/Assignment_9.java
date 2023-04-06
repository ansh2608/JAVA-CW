import java.util.Scanner;

public class Assignment_9 {
    public static boolean isPrime(int num){
        if (num<=1){
            return false;
        }
        for (int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (isPrime(num) && isPrime(num-2)){
            System.out.println(true);
        }
        else System.out.println(false);
    }
}
