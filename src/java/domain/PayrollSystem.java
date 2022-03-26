/*
 * Kallie McGuire
 * Lab 1 - Payroll System - main
 */
package domain;

//import database.* and domain.* to import everthing in those packages instead of having to
//import every class in that package individually
import database.*;
import exceptions.LoginException;
import java.util.ArrayList;

public class PayrollSystem {
    
    static ArrayList<Employee> employees = Employee.getEmployees();
    
    public static Employee verifyLogin(String userID, String password) throws LoginException{
        Employee toLogin = null;
        try {
            for(int i=0; i<employees.size(); i++) {
              if(userID.equals(employees.get(i).getUserID()) &&
              password.equals(employees.get(i).getPassword()))
            
            toLogin = employees.get(i);
        return toLogin;
            }
        }
        catch(Exception e){
        throw new LoginException("Failed login attempt.");
        }
        return toLogin;
    }
    
    private static boolean initialized = false;
    
    public static void initialize() {
//      if (!initialized)
//	PayrollSystem.initialize();
//	initialized = true;
        
        EmployeeDA.initialize();
        PayrollDA.initialize();
        PayrollSystemDA.initialize();
        TimecardDA.initialize();
        WithholdingDA.initialize();
        
        initialized = true;
    }   
    
    public static void initCheck(){
        if (!initialized)
        PayrollSystem.initialize();
            initialized = true;
    }
}
