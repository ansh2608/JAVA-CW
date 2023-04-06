public class no_rectangular {
    public static void main(String[] args) {
        int num=7;
        for (int i=1;i<num+1;i++){
            for (int j=i;j<num+1;j++){
                System.out.print(j+" ");
            }
            for (int k=1;k<i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
