class vehicle
{
    String vehicle_type,vehicle_no;
    vehicle(String type,String no)
    {
        vehicle_type=type;
        vehicle_no=no;
    }
}
class brand extends vehicle
{
    String vehicle_brand;
    brand(String br,String type,String no)
    {
        super(type, no);
        vehicle_brand=br;
    }
}
class cost extends brand
{
    int vehicle_cost;
    cost(String type,String no,String br,int c)
    {
        super(br, type, no);
        vehicle_cost=c;
    }
    void vehicle_info()
    {
        System.out.println("---Vehicle Information---");
        System.out.println("Type : "+vehicle_type+"\nNumber : "+vehicle_no+"\nBrand : "+vehicle_brand+"\nCost : "+vehicle_cost);
    }
}
public class _6a {
    public static void main(String[] args)
    {
        cost c1=new cost("Car","fghj","Maruti",65);
        c1.vehicle_info();
    }
}
