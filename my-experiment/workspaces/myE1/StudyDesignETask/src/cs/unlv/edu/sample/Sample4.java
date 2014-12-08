package cs.unlv.edu.sample;

import cs.unlv.edu.common.Utils;

public class Sample4 {

    /*
     * Similar kind of declaration might be useful for the tasks.
     */
	  public enum Day {

	    SUNDAY( 1, "a relaxing day"), 
	    MONDAY( 2, "a boring day"), 
	    TUESDAY( 3, "just a day"), 
	    WEDNESDAY( 4, "a mid-week crisis day"), 
	    THURSDAY( 5, "almost there to fun times"), 
	    FRIDAY( 6, "a TGIF"), 
	    SATURDAY( 7, "a Weekend") ;
	    
	    int dayOfWeek;
	    String description;

	    private Day(int dayOfWeek, String desc) {
	    	this.dayOfWeek = dayOfWeek;
	    	this.description= desc;
	    }	

	  }

	  public static void main(String[] args) {
	    
	    for (int i = 0; i < Day.values().length; i++) {
	    	Day day = Day.values()[i];
	    	Utils.print(day + " is day " + day.dayOfWeek + " and " + day.description );
	    }
	  }
	   
}
