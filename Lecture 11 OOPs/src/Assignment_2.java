class triangle{
    int a,b,c;
    public double getArea(){
        double s=(a+b+c)/2.0;
        return Math.pow(s*(s-a)*(s-b)*(s-c),.5);
    }
    public double getPeri(){
        return (a+b+c)/2.0;
    }
}
public class Assignment_2 {
    public static void main(String[] args) {
        triangle t=new triangle();
        t.a=2;
        t.b=5;
        t.c=6;
        System.out.println(t.getArea());
        System.out.println(t.getPeri());
    }
}
