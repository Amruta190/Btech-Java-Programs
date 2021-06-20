class Member
{
    String name,address,phone_no;
    int age,salary;
    void printSalary()
    {
        System.out.println("Salary is : "+salary);
    }
}
class Employee extends Member
{
    String specialization;
    Employee(String name, int age, String phone_no, String address, String specialization,int salary)
    {
        this.name=name;
        this.age=age;
        this.phone_no=phone_no;
        this.address=address;
        this.specialization=specialization;
        this.salary=salary;
    }
}
class Manager extends Member
{
    String department;
    Manager(String name, int age, String phone_no, String address, String department,int salary)
    {
        this.name=name;
        this.age=age;
        this.phone_no=phone_no;
        this.address=address;
        this.department=department;
        this.salary=salary;
    }
}
public class Member_class {
    public static void main(String[] args)
    {
        Employee e=new Employee("Aman",21,"6985321456","Kommadi Vizag","Framing",50000);
        Manager m=new Manager("Ram",24,"1523698744","Madurawada Vizag","Research and development",100000);
        System.out.println("\n---Employee details---\n");
        System.out.println("Name : "+e.name+"\nAge : "+e.age+"\nPhone no : "+e.phone_no+"\nAddress : "+e.address+"\nSpecialization : "+e.specialization);
        e.printSalary();
        System.out.println("\n---Manager details---\n");
        System.out.println("Name : "+m.name+"\nAge : "+m.age+"\nPhone no : "+m.phone_no+"\nAddress : "+m.address+"\nDepartment : "+m.department);
        m.printSalary();
        Employee e1=new Employee("Rahul",28,"123654789","Kommadi Vizag","Shipping",55000);
        Employee e2=new Employee("Suman",19,"5263987415","Kommadi Vizag","Siding",60000);
        Employee e3=new Employee("Malini",25,"2569874136","Kommadi Vizag","Painting",65000);
        Employee e4=new Employee("Sandeep",30,"2589631479","Kommadi Vizag","Inspection",70000);
        Employee e5=new Employee("Mohini",22,"3698521478","Kommadi Vizag","Shipping",75000);
        System.out.println("\n---Employee-1 details---\n");
        System.out.println("Name : "+e1.name+"\nAge : "+e1.age+"\nPhone no : "+e1.phone_no+"\nAddress : "+e1.address+"\nSpecialization : "+e1.specialization);
        e1.printSalary();
        System.out.println("\n---Employee-2 details---\n");
        System.out.println("Name : "+e2.name+"\nAge : "+e2.age+"\nPhone no : "+e2.phone_no+"\nAddress : "+e2.address+"\nSpecialization : "+e2.specialization);
        e2.printSalary();
        System.out.println("\n---Employee-3 details---\n");
        System.out.println("Name : "+e3.name+"\nAge : "+e3.age+"\nPhone no : "+e3.phone_no+"\nAddress : "+e3.address+"\nSpecialization : "+e3.specialization);
        e3.printSalary();
        System.out.println("\n---Employee-4 details---\n");
        System.out.println("Name : "+e4.name+"\nAge : "+e4.age+"\nPhone no : "+e4.phone_no+"\nAddress : "+e4.address+"\nSpecialization : "+e4.specialization);
        e4.printSalary();
        System.out.println("\n---Employee-5 details---\n");
        System.out.println("Name : "+e5.name+"\nAge : "+e5.age+"\nPhone no : "+e5.phone_no+"\nAddress : "+e5.address+"\nSpecialization : "+e5.specialization);
        e5.printSalary();
    }
}