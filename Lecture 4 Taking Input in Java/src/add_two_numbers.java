import java.util.Scanner;

public class add_two_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first value: ");
        int a=sc.nextInt();
        System.out.print("Enter Second value: ");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum: "+sum);
    }
}
