public class Factorial {
    public static void main(String[] args) {
        int num=10;
        int ans=1;
        for (int i=1;i<=num;i++){
            ans*=i;
        }
        System.out.println(ans);
    }
}
