import java.util.Scanner;

public class Assignment_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        if (num<0) System.out.println(Math.abs(num));
        else System.out.println(num);
    }
}
