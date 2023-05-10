public class Assignment_6 {
    public static void main(String[] args) {
        int[] arr={10,40,20};
        int[] temp=arr.clone();
        for (int i=1;i< arr.length;i++){
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                int tem=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=tem;
                j--;
            }
        }
        int pos=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (arr[j]==temp[i]){
                    arr[j]=pos;
                    pos++;
                    break;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
