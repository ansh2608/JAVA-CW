import java.util.Scanner;

public class pos_neg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int n=sc.nextInt();
        System.out.println("Enter an array: ");
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=new int[n];
        int idx=0;
        for (int i=0;i<n;i++){
            if (arr[i]>=0) {
                ans[idx]=arr[i];
                idx++;
            }
        }
        for (int i=0;i<n;i++){
            if (arr[i]<0) {
                ans[idx]=arr[i];
                idx++;
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
