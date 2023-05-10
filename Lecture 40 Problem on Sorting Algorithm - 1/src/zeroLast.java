public class zeroLast {
    static void zero(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]==0 && arr[j+1]!=0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={0,5,0,3,42};
        zero(arr);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
