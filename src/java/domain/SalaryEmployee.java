//SalaryEmployee extends the abstract class Employee
//will define and create getters/setters for attributes unique to SalaryEmployees
package domain;

public class SalaryEmployee extends Employee{
    private double annualSalary;

    //had to override getter/setter methods for annualSalary
    //initially created in Employee.java
    @Override
    public double getAnnualSalary() {
        return annualSalary;
    }

    @Override
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    
    public static double calculateGrossPay(Employee e) {
        double grossPay;
        grossPay = e.getAnnualSalary() / 52;
        return grossPay;
    }
    }