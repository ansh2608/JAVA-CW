public class Assignment_5 {
    public static void main(String[] args) {
        int[] arr={5,3,0,7,4};
        for (int i=1;i<arr.length;i++){
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        int a=0;
        int b=0;
        for (int i=0;i<arr.length;i++){
            if (i%2==0){
                a=a*10+arr[i];
            }
            else {
                b=b*10+arr[i];
            }
        }
        System.out.println(a+b);
    }
}
