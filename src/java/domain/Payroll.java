/*Payroll class
getters/setters and toString for the payroll class*/
package domain;

import database.PayrollDA;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Payroll implements Serializable {
    private Date payday;
    private int employeeId;
    private double grossPay;
    private double totalDeductions;
    private double netPay;

    public Payroll() {
    }
    
    //payday is the date that the employees get paid
    public Date getPayday() {
        return payday;
    }

    public void setPayDay(Date payday) {
        this.payday = payday;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }

    public double getTotalDeductions() {
        return totalDeductions;
    }

    public void setTotalDeductions(double totalDeductions) {
        this.totalDeductions = totalDeductions;
    }

    public double getNetPay() {
        return netPay;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }
    
    
    public static ArrayList<Payroll> getPayroll() {
        return PayrollDA.getPayroll();
    }
    
    //using this to format the double values I have into US currency
    NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
    
    //formats dates in mm/dd/yy format
    DateFormat myFormat = DateFormat.getDateInstance(DateFormat.SHORT);
    
    @Override
    public String toString() {
        return "Pay day: " + myFormat.format(payday) + ", Employee ID: " + employeeId + 
                ", gross pay: " + nf.format(grossPay) + ", total deductions: " + nf.format(totalDeductions)
                + ", net pay: " + nf.format(netPay) + '}';
    }
}