class Student{
    String name;
    int roll_no;
}
public class Assignment_1 {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="John";
        s.roll_no=21;
        System.out.println("Name: "+s.name+"\nRoll Number: "+s.roll_no);
    }
}
