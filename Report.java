package Report;
import Sports_info.*;
import Student_info.*;
class Sports1 implements Sports
{
    public void sports_details()
    {
        System.out.println("Sports details");
    }
}
public class Report 
{
    public static void main(String[] args)
    {
        Student s = new Student();
        Sports1 s1 = new Sports1();
        System.out.println("---Student details---");
        System.out.println("Name : "+s.name+"\nRoll no : "+s.roll_no);
        System.out.println("---Sports details---");
        s1.sports_details();
    }
}