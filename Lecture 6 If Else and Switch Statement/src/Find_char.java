import java.util.Scanner;

public class Find_char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='a') System.out.println("PRESENT");
            else System.out.println("NOT");
        }

    }
}
