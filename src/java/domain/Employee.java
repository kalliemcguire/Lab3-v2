//Employee class - here the class will be defined, as well as any
//methods the class will use, ex. the toString and getEmployees
package domain;

import database.EmployeeDA;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public abstract class Employee implements Serializable {
    private int employeeId;
    private String lastName;
    private String firstName;
    private long ssNumber;
    private String userID;
    private String password;

    public Employee() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public long getSsNumber() {
        return ssNumber;
    }

    public void setSsNumber(long ssNumber) {
        this.ssNumber = ssNumber;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    /*need to have the getters/setters here so we can use them when creating employees in the
    EmployeeDA class, their values are overridden in their respective subclasses*/
    public double getAnnualSalary(){
        return 0.0;
    }
    
    public void setAnnualSalary(double a) {}
    
    public double getHourlyRate() {
        return 0.0;
    }
    
    public void setHourlyRate(double b) {}
    
    public double getOvertimeRate() {
        return 0.0;
    }
    
    public void setOvertimeRate(double c) {}
    
    /*calculateGrossPay is different depending on if the employee is hourly
    or salary, method is overridden in subclasses*/
    public static double calculateGrossPay(Employee e, Date d) {
        return 0.0;
    }
    
    /*calculateNetPay is the same for either hourly or salary employees, doesn't
    need to be overridden in each subclass*/
    public static double calculateNetPay(double grossPay, double totalDeductions) {
        double netPay;
        netPay = grossPay - totalDeductions;
        return netPay;
    }
    /*only want the Employee class to have access to EmployeeDA class,
    this method allows me to get the arraylist from other classes without directly
    going into the EmployeeDA class*/
    public static ArrayList<Employee> getEmployees() {
        return EmployeeDA.getEmployees();
    }
    
    /*overriding toString method to print out more useful
    information about instances of the Employee class*/
    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Last Name: " + lastName + ", "
                + "First Name: " + firstName + ", SSN: " + ssNumber;
    }
    
//    public static boolean verifyLogin(String userID, String password) {
//    ArrayList<Employee> employees = Employee.getEmployees();
//    for (int i=0; i<employees.size(); i++) {
//         if(userID.equals(employees.get(i).getUserID()) &&
//            password.equals(employees.get(i).getPassword()))
//            return true;
//        }
//        return false;
//    }
//    
//    public static boolean verifyPassword(String password) {
//        ArrayList<Employee> employees = Employee.getEmployees();
//        for (int i=0; i<employees.size(); i++) {
//            if(password.equals(employees.get(i).getPassword()))
//               return true;
//        } 
//        return false;
//    }
//    
//    public static boolean verifyUserID(String userID) {
//        ArrayList<Employee> employees = Employee.getEmployees();
//        for (int i=0; i<employees.size(); i++) {
//            if (userID.equals(employees.get(i).getUserID()))
//                return true;
//        }
//        return false;
//    }
}