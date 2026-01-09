class Employee {

    String name;                     
    int id;  
    String department;
    double salary;

    static String company = "TCS";   

    Employee(String n, int i,String d,double s) 
    {
        name = n;
        id = i;
        department=d;
        salary=s;
    }

    void showDetails() 
    {
        System.out.println("Name: " + name + ", ID: " + id + ",Department:"+ department + ",Salary:" + salary + ", Company: " + company);
    }

    static void showCompany() 
    {
        System.out.println("Company Name: " + company);
    }
}

public class employee_details 
{
    public static void main(String[] args) 
    {

        Employee e1 = new Employee("Anvi", 101);
        Employee e2 = new Employee("Rohan", 102);
        Employee e3 = new Employee("Sneha", 103);
        Employee e4 = new Employee("Aditya", 104);
        Employee e5 = new Employee("Om", 105);
        Employee e6 = new Employee("Piyush", 106);
        Employee e7 = new Employee("Ankita", 107);
        Employee e8 = new Employee("Sanjana", 108);
        Employee e9 = new Employee("Sanket", 109);
        Employee e10 = new Employee("Vihan", 110);

        Employee.showCompany();
        e1.showDetails();
        e2.showDetails();
        e3.showDetails();
        e4.showDetails();
        e5.showDetails();
        e6.showDetails();
        e7.showDetails();
        e8.showDetails();
        e9.showDetails();
        e10.showDetails();

           
    }
}


