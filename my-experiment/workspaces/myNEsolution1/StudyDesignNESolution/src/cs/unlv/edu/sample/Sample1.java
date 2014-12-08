package cs.unlv.edu.sample;

import cs.unlv.edu.common.Utils;

public class Sample1 {

    /*
     * Similar type of declaration might be useful for the tasks.
     */
    public static final int SUNDAY = 0;
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;

    public String getDayName(int day) {
       
        String dayName = "";
        
        switch(day) {
            case SUNDAY:
                dayName = "SUNDAY";
                break;
            case MONDAY:
                dayName = "MONDAY";
                break;
            case TUESDAY:
                dayName = "TUESDAY";
                break;
            case WEDNESDAY:
                dayName = "WEDNESDAY";
                break;
            case THURSDAY:
                dayName = "THURSDAY";
                break;
            case FRIDAY:
                dayName = "FRIDAY";
                break;
            case SATURDAY:
                dayName = "SATURDAY";
                break;
            default:
                dayName = "UNKNONW";
        }
        
        return dayName;
        
    }

    public String isWeekend(int day) {

        if ( day == SATURDAY || day == SUNDAY ) {
            return getDayName(day) + " is a weekend and day " + (day+1) + " of the week.";
        }

        return getDayName(day) + " is not a weekend and day " + (day+1) + " of the week.";
    }

    public static void main(String[] args) {

        Sample1 obj = new Sample1();

        Utils.print(obj.isWeekend(Sample1.SUNDAY));
        Utils.print(obj.isWeekend(Sample1.TUESDAY));
        Utils.print(obj.isWeekend(Sample1.SATURDAY));
        Utils.print(obj.isWeekend(Sample1.WEDNESDAY));

    }

}
