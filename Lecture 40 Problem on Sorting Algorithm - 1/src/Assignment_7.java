public class Assignment_7 {
    public static void main(String[] args) {
        int[] arr={2,2,1};
        for (int i=1;i< arr.length;i++){
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                int tem=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=tem;
                j--;
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
