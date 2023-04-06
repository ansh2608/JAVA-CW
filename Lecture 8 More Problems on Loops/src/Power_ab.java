public class Power_ab {
    public static void main(String[] args) {
        int a=4,b=3;
        int ans=1;
        while (b>0){
            ans*=a;
            b--;
        }
        System.out.println(ans);
    }
}
