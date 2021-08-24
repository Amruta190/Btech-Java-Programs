class function
{
    synchronized void print(char ch)
    {
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=i;j++)
            {
                try 
                {
                    Thread.sleep(100);
                } 
                catch (InterruptedException e) 
                {
                    System.out.println(e);
                }
                System.out.print(ch);
            }
            System.out.println(" ");
        }
    }
}
class thread1 extends Thread
{
    function f;
    thread1(function f)
    {
        this.f=f;
    }
    public void run()
    {
        f.print('*');
    }
}
class thread2 extends Thread
{
    function f;
    thread2(function f)
    {
        this.f=f;
    }
    public void run()
    {
        f.print('#');
    }
}
public class _11b{
    public static void main(String args[])
    {
        function f=new function();
        thread1 t1=new thread1(f);
        thread2 t2=new thread2(f);
        t1.start();
        t2.start();
    }
}