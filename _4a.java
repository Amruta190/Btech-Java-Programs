class Box
{
    double height;
    double width;
    double depth;
    Box(double height, double width, double depth)
    {
        this.height=height;
        this.width=width;
        this.depth=depth;
    }
    double Volume()
    {
        return height*width*depth;
    }
}
public class _4a {
    public static void main(String[] args)
    {
        Box b1=new Box(12.67,13.26,16.52);
        System.out.println("Volume of b1 is : "+b1.Volume());
        Box b2=new Box(15.67,21.26,4.52);
        System.out.println("Volume of b2 is : "+b2.Volume());
        Box b3=new Box(13.6,6.21,17.56);
        System.out.println("Volume of b3 is : "+b3.Volume());
    }
}