/*didn't end up adding elements to the payroll arraylist in the DA class
like I did for the others*/
package database;

import domain.Payroll;
import java.util.*;

public class PayrollDA {
    
    private static ArrayList<Payroll> payroll = new ArrayList<Payroll>();
    
    public static void initialize() {
        
    }
    
    public static ArrayList<Payroll> getPayroll() {
        return payroll;
    }
}