public class Pyramid {
    public static void main(String[] args) {
        int num=4;
        for (int i=1,k=0;i<=num;++i,k=0){
            for (int j=1;j<=num;++j){
                System.out.print(" ");
            }
            while (k !=2*i-1){
                System.out.print("*");
                ++k;
            }
            System.out.println();
        }
    }
}
