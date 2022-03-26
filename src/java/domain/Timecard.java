//Timecard class contains the getters/setters used for creating timecard instances
package domain;

import database.TimecardDA;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.*;

public class Timecard implements Serializable {
    private Date date;
    private int employeeId;
    private double hoursWorked;
    private double overtimeHours;
    private int timecardId;
    
    DateFormat myFormat = DateFormat.getDateInstance(DateFormat.SHORT);
    
    public Timecard() {
    }
    
    public Date getDate() {
        myFormat.format(date);
        return date;
    }

    public void setDate(Date d) {
        this.date = d;  
    }
            
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getHoursWorked() {
        return hoursWorked;
        //needs to be formatted, two decimal points
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public int getTimecardId() {
        return timecardId;
    }

    public void setTimecardId(int timecardId) {
        this.timecardId = timecardId;
    }
            
    public static ArrayList<Timecard> getTimecards() {
        return TimecardDA.getTimecards();
    }
    
    public static ArrayList<Timecard> getEmployeeTimecards(int employeeId) {
        return TimecardDA.getEmployeeTimecards(employeeId);
    }
            
    @Override
    public String toString() {
        return "Timecard: " + "date: " + myFormat.format(date) + ", Employee ID: " + employeeId + ", hours worked: " 
                + hoursWorked + ", overtime hours: " + overtimeHours;
    }     
    
    //need a get employee timecards method pass ID as parameter
    }