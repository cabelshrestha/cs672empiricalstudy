package cs.unlv.edu.common;

public class Utils {

	public static void print(String str) {
		System.out.println(str);
	}
	
	public static void print(int val) {
		print( String.valueOf(val) );
	}
	
	public static void print(boolean bool) {
		print( String.valueOf(bool) );
	}
	
	public static boolean isEmpty(String str) {
		if (str == null || str.isEmpty() )
			return true;
		return false;
	}
	
}
