/*HourlyEmployee extends the abstract class Employee
will define and create getters/setters for attributes unique to HourlyEmployees*/
package domain;

import java.util.ArrayList;
import java.util.Date;

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double overtimeRate;
    
    //had to override getter/setter methods for hourlyRate and overtimeRate
    //initially created in Employee.java
    @Override
    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getOvertimeRate() {
        return overtimeRate;
    }

    @Override
    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }
    
    //method to get hours worked by hourly employees on a given date
    /*the if statements in the for loop check if the the day 
    of the month in each timecard element is the same as the day of the month
    in the date I passed into getTotalHours
    date.getDate() is really the day of month*/
    public static double getTotalHours(Employee e, Date date) {
        ArrayList<Timecard> timecards = Timecard.getTimecards();
        for (int i = 0; i<timecards.size(); i++) { 
                if (timecards.get(i).getEmployeeId() == e.getEmployeeId() &&
                    timecards.get(i).getDate().getDate() == date.getDate() &&
                    timecards.get(i).getDate().getMonth() == date.getMonth() &&
                    timecards.get(i).getDate().getYear() == date.getYear()) {
                    
                    timecards.get(i).getHoursWorked();

                    return timecards.get(i).getHoursWorked();
                } 
    }
        return 0.0;
    }
    
    //this is basically the same as getTotalHours, but it gets the overtime
    //hours from each date and each hourly employee
    public static double getOvertimeHours(Employee e, Date date) {
        ArrayList<Timecard> timecards = Timecard.getTimecards();
        for (int i=0; i<timecards.size(); i++) {
            if (timecards.get(i).getEmployeeId() == e.getEmployeeId() &&
                timecards.get(i).getDate().getDate() == date.getDate() &&
                timecards.get(i).getDate().getMonth() == date.getMonth() &&
                timecards.get(i).getDate().getYear() == date.getYear()) {
                
                timecards.get(i).getOvertimeHours();
                
                return timecards.get(i).getOvertimeHours();
            }        
    }
        return 0.0;
    }
    
    //method to calculate grossPay for hourly employees
    public static double calculateGrossPay (Employee e, Date d) {
        double grossPay;
        grossPay = (e.getHourlyRate() * HourlyEmployee.getTotalHours(e, d)) 
                + (e.getOvertimeRate() * HourlyEmployee.getOvertimeHours(e, d));
        return grossPay;
    }
}