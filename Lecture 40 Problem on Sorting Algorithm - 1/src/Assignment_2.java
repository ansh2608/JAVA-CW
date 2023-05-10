public class Assignment_2 {
    public static void main(String[] args) {
        String s="coding";
        char[] ch=s.toCharArray();
        for (int i=1;i< ch.length;i++){
            int j=i;
            while(j>0 && ch[j]<ch[j-1]){
                char temp=ch[j];
                ch[j]=ch[j-1];
                ch[j-1]=temp;
            }
        }
        String ans="";
        for (int i=0;i< ch.length;i++){
            ans+=ch[i];
        }
        System.out.println(ans);
    }
}
