import java.lang.Math;
class Calculator
{
    static double powerInt(int num1,int num2)
    {
        return Math.pow(num1, num2);
    }
    static double Double(double num1,double num2)
    {
        return Math.pow(num1, num2);
    }
}
public class _4b {
    public static void main(String[] args)
    {
        System.out.println("powerInt method gives : "+Calculator.powerInt(2,3));
        System.out.println("powerInt method gives : "+Calculator.Double(2.0,3.0));
    }
}
