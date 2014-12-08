package cs.unlv.edu.task2;

import cs.unlv.edu.common.Utils;


public class Months {

	public static final int JAN = 1;
	public static final int FEB = 2;
	public static final int MAR = 3;
	public static final int APR = 4;
	public static final int MAY = 5;
	public static final int JUN = 6;
	public static final int JUL = 7;
	public static final int AUG = 8;
	public static final int SEP = 9;
	public static final int OCT = 10;
	public static final int NOV = 11;
	public static final int DEC = 12;
	
	public void printMonthInformation( int month ) {

		Utils.print("The month name: " + getMonthName(month));
		Utils.print("Sequence: " + month );
		Utils.print("Total days: " + getNumberOfDays(month));

	}
	
	public int getNumberOfDays(int month) {
		int count = 0;
	
		switch(month) {
		
		case JAN:
			count = 31;
			break;
		case FEB: 
			count = 28;
			break;
		case MAR:
			count = 31;
			break;
		case APR:
			count = 30;
			break;
		case MAY:
			count = 31;
			break;
		case JUN:
			count = 30;
			break;
		case JUL:
			count = 31;
			break;
		case AUG:
			count = 31;
			break;
		case SEP:
			count = 30;
			break;
		case OCT:
			count = 31;
			break;
		case NOV:
			count = 30;
			break;
		case DEC:
			count = 31;
			break;
			
		}
		
		return count;
	}

	public String getMonthName( int month ) {
		
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
			default:
				name = "Unknown";
		}
		
		return name;
	}
	
	
	public static void main(String[] args) {

		Months obj = new Months();

		obj.printMonthInformation(Months.JAN);
		obj.printMonthInformation(Months.APR);
		obj.printMonthInformation(Months.NOV);
	}
	
	
}
