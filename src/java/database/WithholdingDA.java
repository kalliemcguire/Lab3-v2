//all withholding types will be created and added to withholding arraylist here
package database;

import domain.Withholding;
import java.util.ArrayList;

public class WithholdingDA {
    
    private static ArrayList<Withholding> withholding = new ArrayList<Withholding>();
    
    public static void initialize() {
        
        Withholding w;
        
        w = new Withholding();
        w.setWithholdingId(001);
        w.setDescription("Social Security withholding");
        w.setRate(0.06);
        
        withholding.add(w);
        
        w = new Withholding();
        w.setWithholdingId(002);
        w.setDescription("Employer health insurance withholding");
        w.setAmount(250);
        
        withholding.add(w);
        }   
    
    public static ArrayList<Withholding> getWithholding() {
        return withholding;
    }
}