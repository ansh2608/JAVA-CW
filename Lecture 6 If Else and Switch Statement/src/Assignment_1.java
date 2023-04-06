import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        if (l==b) System.out.println("It is a square");
        else System.out.println("It is a rectangle");
    }
}
