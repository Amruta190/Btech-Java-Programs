interface Bank1
{
    int minimumBalance=1000;
    void interestRate();
    void myBank();
}
class SBI implements Bank1
{
    public void interestRate()
    {
        System.out.println("Minimum balance is "+minimumBalance);
        System.out.println("Interest rate in SBI");
    }
    public void myBank()
    {
        System.out.println("Bank : SBI");
    }
}
class AndhraBank implements Bank1
{
    public void interestRate()
    {
        System.out.println("Minimum balance is "+minimumBalance);
        System.out.println("Interest rate in AndhraBank");
    }
    public void myBank()
    {
        System.out.println("Bank : AndhraBank");
    }
}
class CanaraBank implements Bank1
{
    public void interestRate()
    {
        System.out.println("Minimum balance is "+minimumBalance);
        System.out.println("Interest rate in CanaraBank");
    }
    public void myBank()
    {
        System.out.println("Bank : CanaraBank");
    }
}
class ICICI implements Bank1
{
    public void interestRate()
    {
        System.out.println("Minimum balance is "+minimumBalance);
        System.out.println("Interest rate in ICICI");
    }
    public void myBank()
    {
        System.out.println("Bank : ICICI");
    }
}
public class Banks 
{
    public static void main(String[] args)
    {
        ICICI b1=new ICICI();
        b1.interestRate();
        b1.myBank();
        CanaraBank b2=new CanaraBank();
        b2.interestRate();
        b2.myBank();
        AndhraBank b3=new AndhraBank();
        b3.interestRate();
        b3.myBank();
        SBI b4=new SBI();
        b4.interestRate();
        b4.myBank();
    }
}
