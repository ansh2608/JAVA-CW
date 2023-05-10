public class Assignment_4 {
    public static void main(String[] args) {
        int[] arr={2,-3,5,8,1,0,-4};
        int max=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (max>arr[i]) max=arr[i];
        }
        System.out.println(max);
    }
}
