class A implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println("Good Morning");
        }
    }
}
class B implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try
            {
                Thread.sleep(2000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println("Hello");
        }
    }
}
class C implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try
            {
                Thread.sleep(3000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}
public class _11a_Runnable {
    public static void main(String args[])
    {
        A a1=new A();
        B b1=new B();
        C c1=new C();
        Thread t1=new Thread(a1);
        Thread t2=new Thread(b1);
        Thread t3=new Thread(c1);
        t1.start();
        t2.start();
        t3.start();
    }
}
