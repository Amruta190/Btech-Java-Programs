class XYZ
{
    XYZ()
    {
        System.out.println("I am a Constructor");
    }
    static
    {
        System.out.println("I am First Static block");
    }
    static void display()
    {
        System.out.println("I am a Static method");
    }
    static
    {
        System.out.println("I am Second static block");
        display();
    }
}
public class static_block {
    public static void main(String[] args)
    {
        XYZ m=new XYZ();
        static
        {
            XYZ.display();
        }
    }
}
