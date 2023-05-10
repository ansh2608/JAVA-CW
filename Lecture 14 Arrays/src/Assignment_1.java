public class Assignment_1 {
    public static void main(String[] args) {
        int[] arr={2,6,-5,-1,0,4,-9};
        int max=0;
        for (int i=0;i<arr.length;i++){
            if (max<=arr[i]) System.out.println(arr[i]);
        }
    }
}
