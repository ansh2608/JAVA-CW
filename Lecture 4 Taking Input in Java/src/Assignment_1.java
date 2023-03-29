import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String f_name= sc.next();
        String l_name= sc.next();
        int roll=sc.nextInt();
        String field=sc.next();
        System.out.print("Name: "+f_name+" "+l_name);
        System.out.println();
        System.out.print("Roll No: "+roll);
        System.out.println();
        System.out.print("Field of Interest: "+field);
    }
}
