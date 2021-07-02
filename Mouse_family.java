interface Rodent
{
    void size();
    void bodyandtail();
}
class Mouse implements Rodent
{
    public void size()
    {
        System.out.println("Mouses vary in sizes");
    }
    public void bodyandtail()
    {
        System.out.println("Mouses have long tails and small body");
    }
}
class Gerbil implements Rodent
{
    public void size()
    {
        System.out.println("Gerbils are of same size");
    }
    public void bodyandtail()
    {
        System.out.println("Gerils have medium sized body and long tails");
    }
}
class Hamster implements Rodent
{
    public void size()
    {
        System.out.println("Hamsters vary in sizes");
    }
    public void bodyandtail()
    {
        System.out.println("Hamsters have huge body and short tails");
    }
}
public class Mouse_family 
{
    public static void main(String[] args)
    {
        Rodent[] r=new Rodent[3];
        Mouse m=new Mouse();
        Gerbil g=new Gerbil();
        Hamster h=new Hamster();
        r[0]=m;
        r[1]=g;
        r[2]=h;
        for(int i=0;i<3;i++)
        {
            r[i].size();
            r[i].bodyandtail();
        }
    }
}