class Employee {

    String name;                     
    int id;                          

    static String company = "TCS";   

    Employee(String n, int i) {
        name = n;
        id = i;
    }

    void showDetails() 
    {
        System.out.println("Name: " + name + ", ID: " + id + ", Company: " + company);
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

        Employee.showCompany();
        e1.showDetails();
        e2.showDetails();
        e3.showDetails();

           
    }
}

