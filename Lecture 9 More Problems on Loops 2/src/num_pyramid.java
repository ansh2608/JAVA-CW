public class num_pyramid {
    public static void main(String[] args) {
        int num=4;
        int k;
        for (int i=num-1;i>0;i--){
            for (int j=i;j>2;j--){
                System.out.print(" ");
            }
            for (k=1;k<=(num-i+1);k++){
                System.out.print(k);
            }
            for (int m=k;m>=1;m--){
                System.out.print(m);
            }
            System.out.println();
        }
    }
}
