import java.util.Scanner;
class Area{
    int length;
    int breadth;
    public Area(int l,int b){
        length=l;
        breadth=b;
    }
    public int getArea(){
        return length*breadth;
    }
}
public class Assignment_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b= sc.nextInt();
        Area a=new Area(l,b);
        System.out.println(a.getArea());
    }
}
