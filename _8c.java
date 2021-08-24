import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
class Employee1
{
    String name,dept;
    int salary,id;
    Employee1(String name, int salary, String dept)
    {
        this.name=name;
        this.salary=salary;
        this.dept=dept;
    }
    public int getId() {
        return id;
    }
    public void setID(int id){
        this.id=id;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
public class _8c {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in)	;
        Employee1 e1=new Employee1("Ravi",10000,"Production");
        Employee1 e2=new Employee1("Akanksh",20000,"Cinematography");
        Employee1 e3=new Employee1("Suneel",30000,"Direction");
        HashMap<Integer,Employee1> hash=new HashMap<Integer,Employee1>();
        hash.put(1,e1);
        hash.put(2,e2);
        hash.put(3,e3);
        System.out.println(hash);
        for (Map.Entry <Integer,Employee1> m : hash.entrySet()) 
        {
            int key=m.getKey();
            Employee1 e=m.getValue();
            System.out.print("\nKEY: "+key+",  ");
            System.out.print("VALUE  :");
            System.out.print(e.name+"  "+e.salary+"  "+e.dept+"  ");
        }
        System.out.println("\nEnter key value to be serached");
        int k=s.nextInt();
        if(hash.containsKey(k))
            System.out.print("KEY "+k+" is available");
        else 
            System.out.print("KEY "+k+" is not available");
        s.close();
    }
}
