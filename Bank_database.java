import java.util.Scanner;
class Bank
{
    int balance=0;
    void deposit(int acc_no,String name,int amount)
    {
        System.out.println("Amount "+amount+" is deposited");
        balance+=amount;
    }
    void withdraw(int acc_no,String name,int amount)
    {
        if(balance<amount)
            System.out.println("Sufficient amount is not present in your account!!!");
        else
        {
            System.out.println("Amount "+amount+" is withdrawed");
            balance-=amount;
        }
    }
    public int getBalance() 
    {
        return balance;
    }
}
public class Bank_database {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Bank b=new Bank();
        System.out.print("---Please provide the details---\nAccount_no : ");
        int acc_no=sc.nextInt();
        System.out.print("Account holder name : ");
        String name=sc.next();
        while(true)
        {
            System.out.println("Choose one option :\n1. Deposit\t2.Withdraw\t3.Check balance \t4.Exit");
            int k=sc.nextInt();
            switch(k)
            {
                case 1:
                {
                    System.out.print("Amount to be deposited: ");
                    int amount=sc.nextInt();
                    b.deposit(acc_no, name, amount);
                }
                break;
                case 2:
                {
                    System.out.print("Amount to be withdrawed: ");
                    int amount=sc.nextInt();
                    b.withdraw(acc_no, name, amount);
                }
                break;
                case 3:
                {
                    System.out.println("Balance amount is "+b.getBalance());
                }
                break;
                case 4:
                {
                    System.exit(0);
                }
                default:System.out.println("Please enter correct input!!!");
            }
        }
    }
}
