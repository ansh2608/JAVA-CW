import java.util.Scanner;

public class Assignment_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y= sc.nextInt();
        System.out.println("Values of x & y: "+x+","+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("Values of x & y: "+x+","+y);
    }
}
