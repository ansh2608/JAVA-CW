import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter p: ");
        float p=sc.nextInt();
        System.out.print("Enter r: ");
        float r=sc.nextInt();
        System.out.print("Enter t: ");
        float t=sc.nextInt();
        float SI=(p*r*t)/100;
        System.out.println(SI);
    }
}
