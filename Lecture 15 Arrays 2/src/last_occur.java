public class last_occur {
    public static void main(String[] args) {
        int[] arr={1,4,7,9,1};
        int x=1;
        int index=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x) index=i;
        }
        System.out.println(index);
    }
}
