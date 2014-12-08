package cs.unlv.edu.sample;

import cs.unlv.edu.common.Utils;

public class Sample4 {
    
    /*
     * This is the inner class.
     * 
     * Similar kind of solution might be useful for the tasks.
     */
    private static class Day {

        public int dayOfWeek;
        public String dayName;
        public String description;

        public Day(int dow, String name, String desc) {
            this.dayOfWeek= dow;
            this.dayName = name;
            this.description = desc;
        }

        @Override
        public String toString() {
            return "dayOfWeek=" + dayOfWeek + " name=" + dayName + " description=" + description;
        }
    }
    
    public static final Day SUNDAY = new Day(1, "SUNDAY", "a relaxing day");
    public static final Day MONDAY = new Day(2, "MONDAY", "a boring day");
    public static final Day TUESDAY = new Day(3, "TUESDAY", "just a day");
    public static final Day WEDNESDAY = new Day(4, "WEDNESDAY", "a mid-week crisis day");
    public static final Day THURSDAY = new Day(5, "THURSDAY", "almost there to fun times");
    public static final Day FRIDAY = new Day(6, "FRIDAY", "a TGIF");
    public static final Day SATURDAY = new Day(7, "SATURDAY", "a Weekend");
    
    public static void main(String[] args) {
     
      Utils.print(SUNDAY.dayName + " is day " + SUNDAY.dayOfWeek + " and " + SUNDAY.description );
      Utils.print(MONDAY.dayName + " is day " + MONDAY.dayOfWeek + " and " + MONDAY.description );
      Utils.print(TUESDAY.dayName + " is day " + TUESDAY.dayOfWeek + " and " + TUESDAY.description );
      Utils.print(WEDNESDAY.dayName + " is day " + WEDNESDAY.dayOfWeek + " and " + WEDNESDAY.description );
      Utils.print(THURSDAY.dayName + " is day " + THURSDAY.dayOfWeek + " and " + THURSDAY.description );
      Utils.print(FRIDAY.dayName + " is day " + FRIDAY.dayOfWeek + " and " + FRIDAY.description );
      Utils.print(SATURDAY.dayName + " is day " + SATURDAY.dayOfWeek + " and " + SATURDAY.description );

    }
     
}
