public class max_element {
    public static void main(String[] args) {
        int[] arr={1,5,3};
        int mx=arr[0];
        for (int i=0;i<arr.length;i++){
            if (mx<arr[i]) mx=arr[i];
        }
        System.out.println(mx);
    }
}
