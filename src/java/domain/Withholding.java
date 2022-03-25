/*Withholding class - contains getters/setters as well as a method
used to calculate withholding deductions from gross pay*/
package domain;

import database.WithholdingDA;
import java.io.Serializable;
import java.util.*;

public class Withholding implements Serializable {
    private int withholdingId;
    private String description;
    private double amount;
    private double rate;

    public Withholding() {
    }
    
    public int getWithholdingId() {
        return withholdingId;
    }

    public void setWithholdingId(int withholdingId) {
        this.withholdingId = withholdingId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    } 

    public static ArrayList<Withholding> getWithholding() {
        return WithholdingDA.getWithholding();
    }
    
    /*this method is for getting the total deductions that are subtracted from
    grossPay. takes the netPay as a parameter.
    I have one withholding that is a rate, and one that is just an amount.
    I loop through all of the elements in the withholding arraylist,
    get the amount or rate(and multiply rate by netPay). I then accumulate
    the deduction to add up all of the withholding that will be subtracted.
    did not know how/or if possible to just get the amount or rate depending
    on if it was a withholding type that had a rate or an amount
    */
    public static double calculateTotalDeductions(double netPay) {
        double deductions = 0;
        ArrayList<Withholding> withholding = Withholding.getWithholding();
        for (int i=0; i<withholding.size(); i++) {
            deductions += withholding.get(i).getAmount() + withholding.get(i).getRate()*netPay;
        }
        return deductions;
    }
    
    @Override
    public String toString() {
        return "Withholding: " + "withholding ID: " + withholdingId + ", description: " + description + 
                ", amount: " + amount + ", rate: " + rate + '}';
    }   
}