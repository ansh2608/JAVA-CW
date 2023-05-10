public class Assignment_4 {
    public static void main(String[] args) {
        int n=5;
        int[] arr={10,4,2,8,9};
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i=n/2;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
