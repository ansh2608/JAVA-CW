public class alphabeticalOrder {
    static void sortFruits(String[] arr){
        for (int i=0;i<arr.length;i++){
            int min_index=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j].compareTo(arr[min_index])<0){
                    min_index=j;
                }
            }
            String temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }
    public static void main(String[] args) {
        String[] fruits={"kiwi","apple","papaya","mango"};
        sortFruits(fruits);
        for (String i:fruits){
            System.out.print(i+" ");
        }
    }
}
