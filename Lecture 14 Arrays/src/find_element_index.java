public class find_element_index {
    public static void main(String[] args) {
        int[] arr={1,5,3};
        int x=5;
        for (int i=0;i<arr.length;i++){
            if (x==arr[i]) System.out.println(i);
        }
    }
}
