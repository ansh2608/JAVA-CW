public class Optimize {
    static void op_bubble(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            boolean flag=false;
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag) return;
        }
    }
    public static void main(String[] args) {
        int[] arr={2,4,3,1,5};
        op_bubble(arr);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
