package cs.unlv.edu.sample;

import cs.unlv.edu.common.Utils;

public class Sample1 {
    
    /*
     * Similar type of declaration might be useful for the tasks.
     */
    public enum Day
    {
      SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY 
    }
    
    public String isWeekend(Day day) {
        
        if ( day == Day.SATURDAY || day == Day.SUNDAY ) {
            return day + " is a weekend and day " + (day.ordinal()+1) + " of the week.";
        }
        
        return day + " is not a weekend and day " + (day.ordinal()+1) + " of the week.";
    }
    
    public static void main(String[] args) {
        
        Sample1 obj = new Sample1();

        Utils.print(obj.isWeekend(Day.SUNDAY));
        Utils.print(obj.isWeekend(Day.TUESDAY));
        Utils.print(obj.isWeekend(Day.SATURDAY));
        Utils.print(obj.isWeekend(Day.WEDNESDAY));

    }

}