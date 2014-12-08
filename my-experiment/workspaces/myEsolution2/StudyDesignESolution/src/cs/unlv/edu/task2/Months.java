package cs.unlv.edu.task2;

import cs.unlv.edu.common.Utils;

public class Months {

	public enum Month {

		JAN( 1, 31 ), 
		FEB( 2, 28 ), 
		MAR( 3, 31 ), 
		APR( 4, 30 ), 
		MAY( 5, 31 ), 
		JUN( 6, 30 ), 
		JUL( 7, 31 ), 
		AUG( 8, 31 ), 
		SEP( 9, 30 ), 
		OCT( 10, 31 ), 
		NOV( 11, 30 ), 
		DEC( 12, 31 );
		
		int count = 0;
		int numberOfDays = 0;

		private Month(int count, int numberOfDays) {
			this.count = count;
			this.numberOfDays = numberOfDays;
		}
		
	}
	
	public void printMonthInformation( Month month ) {

		Utils.print("The month name: " + getMonthName(month));
		Utils.print("Sequence: " + month.count);
		Utils.print("Total days: " + month.numberOfDays);

	}
	
	public String getMonthName( Month month ) {
		
		String name = "";

		switch(month) {
			
			case JAN:
				name = "January";
				break;
			case FEB: 
				name = "February";
				break;
			case MAR:
				name = "March";
				break;
			case APR:
				name = "April";
				break;
			case MAY:
				name = "May";
				break;
			case JUN:
				name = "June";
				break;
			case JUL:
				name = "July";
				break;
			case AUG:
				name = "August";
				break;
			case SEP:
				name = "September";
				break;
			case OCT:
				name = "October";
				break;
			case NOV:
				name = "November";
				break;
			case DEC:
				name = "December";
				break;
		}
		
		return name;
	}
	
	
	public static void main(String[] args) {
		Months obj = new Months();
		obj.printMonthInformation(Month.JAN);
		obj.printMonthInformation(Month.APR);
		obj.printMonthInformation(Month.NOV);
	}
	
	
}
