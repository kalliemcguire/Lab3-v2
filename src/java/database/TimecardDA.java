//creating all timecards for hourly employees in this class
package database;

import domain.Timecard;
import java.util.*;


public class TimecardDA {
    
    private static ArrayList<Timecard> timecards = new ArrayList<Timecard>();
    private static ArrayList<Timecard> employeeTimecards = new ArrayList<Timecard>();
    
    public static void add(Timecard tc) {
        tc.setTimecardId(timecards.size());
        timecards.add(tc);
    }
    
    // create find method, pass timecardId as parameter
    //create update method
    //maybe create delete method
    
    public static void initialize() {
        
        /*only did one timecard foe each employee, couldn't figure out my methods
        for calculating totalhours/totalovertimehours when there was more than
        one for each employee*/
        Timecard t;
        Calendar c;
        c = Calendar.getInstance();
                                
        t = new Timecard();
        c.set(2022, 01, 15);
        t.setDate(c.getTime());
        t.setEmployeeId(103);
        t.setHoursWorked(40);
        t.setOvertimeHours(5);
        
        timecards.add(t);
        
        t = new Timecard();
        c.set(2022, 01, 16);
        t.setDate(c.getTime());
        t.setEmployeeId(103);
        t.setHoursWorked(41);
        t.setOvertimeHours(5);
        
        timecards.add(t);
               
        t = new Timecard();
        c.set(2022, 01, 15);
        t.setDate(c.getTime());
        t.setEmployeeId(104);
        t.setHoursWorked(42);
        t.setOvertimeHours(3);
        
        timecards.add(t);
        
        t = new Timecard();
        c.set(2022, 01, 15);
        t.setDate(c.getTime());
        t.setEmployeeId(104);
        t.setHoursWorked(43);
        t.setOvertimeHours(3);
        
        timecards.add(t);
    }
    
    public static ArrayList<Timecard> getTimecards() {
        return timecards;
    }
    
    public static ArrayList<Timecard> getEmployeeTimecards(int employeeId) {
        employeeTimecards.clear();
        System.out.println("Timecard.getEmployeeTimecards  size of timecards = " + employeeTimecards.size());
        System.out.println("timecards size = " + timecards.size());
        for (int i=0; i<timecards.size(); i++) {
            if(employeeId == timecards.get(i).getEmployeeId())
                employeeTimecards.add(timecards.get(i));
        }
        System.out.println("Timecard.getEmployeeTimecards  size of timecards = " + employeeTimecards.size());
        System.out.println("arraylist employeeTimecards " + employeeTimecards);
        return employeeTimecards;
//        System.out.println("Timecard.getEmployeeTimecards  size of timecards = " + employeeTimecards.size());
//        
//        for (int i = 0; i < timecards.size(); i++) {
//            Timecard r = new Timecard();
//            if(employeeId == timecardsToGet.get(i).getEmployeeId())
//            r = timecardsToGet.get(i);
//          employeeTimecards.add(r);
//        }
//        System.out.println("Timecard.getEnployeeTimecards  size of employeeTimecards = " + employeeTimecards.size());
//        return timecardsToGet;
    }
}