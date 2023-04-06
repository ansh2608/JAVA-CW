public class Hollow_no_rectangle {
    public static void main(String[] args) {
        int row=4,col=6;
        for (int i=1;i<=row;i++){
            for (int j=1;j<=col;j++){
                if (i==1 || i==row || j==1 || j==col){
                    System.out.print(j+" ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
