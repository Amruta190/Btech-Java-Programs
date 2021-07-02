abstract class Shape
{
    abstract void numberOfSides();
}
class Trapezoid extends Shape
{
    void numberOfSides()
    {
        System.out.println("Trapezoid has 4 sides");
    }
}
class Triangle extends Shape
{
    void numberOfSides()
    {
        System.out.println("Triangle has 3 sides");
    }
}
class Hexagon extends Shape
{
    void numberOfSides()
    {
        System.out.println("Hexagon has 6 sides");
    }
}
public class Shapes 
{
    public static void main(String[] args) 
    {
        Trapezoid t1=new Trapezoid();
        t1.numberOfSides();
        Triangle t2=new Triangle();
        t2.numberOfSides();
        Hexagon t3=new Hexagon();
        t3.numberOfSides();
    }
}