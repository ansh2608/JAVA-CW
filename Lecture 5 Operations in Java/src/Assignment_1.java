import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int f=(8+x)/3;
        int res=(f%5)*5;
        System.out.println(res);
    }
}
