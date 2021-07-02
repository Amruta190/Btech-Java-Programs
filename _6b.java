abstract class Figure_3D
{
    abstract void volume();
    // {
    //     System.out.println("Volume of the shape : ");
    // }
    abstract void area();
    // {
    //     System.out.println("Area of Shape : ");
    // }
}
class Cylinder extends Figure_3D
{
    double r,h;
    Cylinder(double r,double h)
    {
        this.r=r;
        this.h=h;
    }
    void volume()
    {
        System.out.println("Child class Cylinder volume: "+3.14*r*r*h);
    }
    void area()
    {
        System.out.println("Child class Cylinder area: "+2*3.14*r*(r+h));
    }
}
class Cone extends Figure_3D
{
    double r,h;
    Cone(double r,double h)
    {
        this.r=r;
        this.h=h;
    }
    void volume()
    {
        System.out.println("Child class Cone volume : "+(3.14*r*r*h)/3);
    }
    void area()
    {
        System.out.println("Child class Cone area : "+2*3.14*r*(r+Math.pow((r*r)+(h*h), 1/2)));
    }
}
class Sphere extends Figure_3D
{
    double r,h;
    Sphere(double r,double h)
    {
        this.r=r;
        this.h=h;
    }
    void volume()
    {
        System.out.println("Child class Sphere volume : "+(4*3.14*r*r*r)/3);
    }
    void area()
    {
        System.out.println("Child class Sphere area : "+4*3.14*r*r);
    }
}
public class _6b {
    public static void main(String[] args)
    {
        Cylinder cl=new Cylinder(1,2);
        Cone c2=new Cone(1,2);
        Sphere c3=new Sphere(1,2);
        Figure_3D f1[]=new Figure_3D[5]; //create an array of figure_3d objects
        f1[0]=cl;
        f1[0].volume();
        f1[0].area();
        f1[1]=c2;
        f1[1].volume();
        f1[1].area();
        f1[2]=c3;
        f1[2].volume();
        f1[2].area();
    }
}
