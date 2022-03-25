//EmployeeDA class, this class serves as a sort of database for all of the employees
//all employees will be created here
package database;

import domain.Employee;
import domain.HourlyEmployee;
import domain.SalaryEmployee;
import java.util.ArrayList;


public class EmployeeDA {
    
    private static ArrayList<Employee> employees = new ArrayList<Employee>();
    
    public static void initialize(){
        
        Employee e;
        
        //Employee is an abstract class, therefore cannot create instances of it
        //and will need to instead create instances of either SalaryEmployee or HourlyEmployee
        
        e = new HourlyEmployee();
        e.setHourlyRate(12.25);
        e.setOvertimeRate(18.50);
        e.setEmployeeId(103);
        e.setFirstName("Charlie");
        e.setLastName("Charleston");
        e.setSsNumber(678932785);
        e.setUserID("User1");
        e.setPassword("user1");
        
        employees.add(e);
        
        e = new HourlyEmployee();
        e.setHourlyRate(18.50);
        e.setOvertimeRate(27.75);
        e.setEmployeeId(104);
        e.setFirstName("Julie");
        e.setLastName("Young");
        e.setSsNumber(384289430);
        e.setUserID("User2");
        e.setPassword("user2");
        
        employees.add(e);
        
        e = new SalaryEmployee();
        e.setAnnualSalary(55000);
        e.setEmployeeId(101);
        e.setFirstName("Bob");
        e.setLastName("Smith");
        e.setSsNumber(555121212);
        e.setUserID("User3");
        e.setPassword("user3");
        
        employees.add(e);
        
        e = new SalaryEmployee();
        e.setAnnualSalary(60000);
        e.setEmployeeId(102);
        e.setFirstName("Susan");
        e.setLastName("Tester");
        e.setSsNumber(555613212);
        e.setUserID("User4");
        e.setPassword("user4");
        
        employees.add(e);
                
    }
    
    public static ArrayList<Employee> getEmployees() {
        return employees;
    }
}