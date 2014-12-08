package cs.unlv.edu.task1;

import cs.unlv.edu.common.Utils;


public class CellNetwork {

	public static final int ATNT = 0;
	public static final int VERIZON = 1;
	public static final int SPRINT = 2;
	public static final int TMOBILE = 3;
	public static final int USCELLULAR = 4;
	
	
	public void printNetworkCompanyName(int network) {
		
		String name = "";

		if ( network == ATNT ) {
			name = "AT&T";
		} else if ( network == VERIZON ) {
			name = "Verizon Wireless";
		} else if ( network == SPRINT ) {
			name = "Sprint Corporation";
		} else if ( network == TMOBILE ) {
			name = "T-Mobile";
		} else if ( network == USCELLULAR ) {
			name = "U.S. Cellular";
		}

		Utils.print(name);
	}
	
	public static void main(String[] args) {

		CellNetwork obj = new CellNetwork();

		obj.printNetworkCompanyName( CellNetwork.ATNT );
		obj.printNetworkCompanyName( CellNetwork.VERIZON);
		obj.printNetworkCompanyName( CellNetwork.SPRINT);
		obj.printNetworkCompanyName( CellNetwork.TMOBILE);
		obj.printNetworkCompanyName( CellNetwork.USCELLULAR);
		obj.printNetworkCompanyName( 10 );
	}
}
