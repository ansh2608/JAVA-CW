import java.util.Scanner;

public class Assignment_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an operator (+,-,*,/): ");
        char op=sc.next().charAt(0);
        System.out.println("Enter first number: ");
        double num1=sc.nextInt();
        System.out.println("Enter second number: ");
        double num2=sc.nextInt();
        double ans;
        switch (op){
            case '+':
                ans=num1+num2;
                System.out.println(num1+"+"+num2+"="+ans);
                break;
            case '-':
                ans=num1-num2;
                System.out.println(num1+"-"+num2+"="+ans);
                break;
            case '*':
                ans=num1*num2;
                System.out.println(num1+"*"+num2+"="+ans);
                break;
            case '/':
                ans=num1/num2;
                System.out.println(num1+"/"+num2+"="+ans);
                break;
            default:
                System.out.println("wrong operator");
                break;
        }
    }
}
